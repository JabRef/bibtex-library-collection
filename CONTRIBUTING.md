# Contributing

Thanks for adding BibTeX libraries to the test suite.

## Add a library

A library is added as a shallow git submodule named `{owner}-{repo}`:

```sh
git submodule add <repo-url> {owner}-{repo}
git config -f .gitmodules submodule.{owner}-{repo}.shallow true
git add .gitmodules {owner}-{repo}
```

If a GitHub URL points at a single `.bib` file, add the whole repository (not just
the file).

Then add a row to the table in [`README.md`](README.md), keeping it sorted
alphabetically by path. If the library has 5 or fewer BibTeX files, deep-link each
file; otherwise show the count. Note that some libraries use the `.bb` extension.

The exact conventions an automated agent follows are documented in
[`CLAUDE.md`](CLAUDE.md).
