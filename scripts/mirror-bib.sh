#!/usr/bin/env sh
# Mirror every .bib / .bb file from the submodules onto the orphan branch
# "mirror", so the content survives even if an upstream repository disappears.
#
# The mirror branch contains only the BibTeX files, at their submodule-relative
# paths. Re-run any time to refresh it; files removed upstream are dropped too.
#
# Usage:  sh scripts/mirror-bib.sh
set -eu

BRANCH=mirror
ROOT=$(git rev-parse --show-toplevel)
TMP=$(mktemp -d)
WT="$TMP/mirror"

cleanup() {
	git -C "$ROOT" worktree remove --force "$WT" 2>/dev/null || true
	rm -rf "$TMP"
}
trap cleanup EXIT

cd "$ROOT"

# Make sure submodule contents are present (shallow is fine).
git submodule update --init --depth 1

# Check out the mirror branch in a throwaway worktree, starting empty.
if git show-ref --verify --quiet "refs/heads/$BRANCH"; then
	git worktree add --force "$WT" "$BRANCH"
	git -C "$WT" rm -rfq . 2>/dev/null || true
else
	git worktree add --force --detach "$WT" HEAD
	git -C "$WT" switch --orphan "$BRANCH"
fi

# Copy every BibTeX file, preserving its submodule-relative path.
git ls-files --recurse-submodules '*.bib' '*.bb' | while IFS= read -r f; do
	mkdir -p "$WT/$(dirname "$f")"
	cp "$ROOT/$f" "$WT/$f"
done

# Commit only if something changed.
cd "$WT"
git add -A
if git diff --cached --quiet; then
	echo "mirror: no changes"
else
	git commit -q -m "Update BibTeX mirror"
	echo "mirror: committed $(git -C "$WT" rev-parse --short HEAD)"
fi
