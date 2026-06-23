# Project: BibTeX test suite

Collection of public BibTeX libraries, gathered as git submodules, used as parser
test input (e.g. for JabRef).

## Adding a new library (from a GitHub URL)

1. Derive the submodule path from the URL as `{owner}-{repo}` (lowercase, as in the
   URL). Example: `https://github.com/latex-lsp/tree-sitter-bibtex` →
   `latex-lsp-tree-sitter-bibtex`.
2. If the URL is a blob (single file), add the **whole** repository as a submodule;
   do not download the single file.
3. Run:
   ```sh
   git submodule add <repo-url> {owner}-{repo}
   git config -f .gitmodules submodule.{owner}-{repo}.shallow true
   git add .gitmodules {owner}-{repo}
   ```
4. Update the README table (see below).
5. Stage every change with `git add`. Commits are batched — do **not** commit unless
   asked; the user makes one large commit at the end.

## README table conventions

Table lives under "Collected libraries (git submodules)" in `README.md`.

- Columns: `Path` | `Source` | `BibTeX files`.
- Rows sorted **alphabetically by path**.
- `Source` links to the GitHub repo (`[owner/repo](https://github.com/owner/repo)`).
- `BibTeX files` column:
  - If the library has **≤ 5** BibTeX files: deep-link each file to its GitHub blob,
    e.g. `[`examples/x.bib`](https://github.com/owner/repo/blob/<branch>/examples/x.bib)`.
  - If **> 5**: show the count and glob, e.g. `14 (`*.bb`)`.
- BibTeX files may use the `.bb` extension instead of `.bib`. Count/enumerate both.

## Mirror branch

Submodules store only a gitlink; if an upstream repo is deleted, its content is
lost. `scripts/mirror-bib.sh` copies every `.bib`/`.bb` file onto the orphan branch
`mirror` (submodule-relative paths) so the content is preserved in this repo.

- Run `sh scripts/mirror-bib.sh` after adding/updating submodules.
- The script commits to the `mirror` branch only (not `main`); it is idempotent and
  drops files that disappeared upstream.
- This is the **one** place commits happen automatically — the `main` batch-commit
  rule above still applies everywhere else.
- CI keeps it fresh: `.github/workflows/mirror.yml` runs the script on every push to
  `main` and pushes the `mirror` branch. It fetches the existing `mirror` ref first
  so history is preserved (otherwise a fresh checkout would re-orphan the branch).

## Non-git sources table

Sources that cannot be submodules (FTP mirrors, query-export sites, personal pages)
go in the "Non-git available BibTeX files" table in `README.md`.

- Columns: `Source` | `Type` | `Entries (approx.)`.
- Entry counts are approximate / unverified — do **not** fabricate exact numbers.
  Use `unknown`, a `~N` approximation, or a qualitative value (e.g.
  `thousands of files`). Keep the "approximate / unverified" disclaimer above the
  table.

## Enumerating BibTeX files

```sh
git ls-files --recurse-submodules '*.bib' '*.bb'
```

Per-submodule count:

```sh
git -C <path> ls-files '*.bib' '*.bb' | wc -l
```

Get a submodule's default branch (for blob deep links):

```sh
git -C <path> rev-parse --abbrev-ref HEAD
```
