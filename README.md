# BibTeX Library Collection

This repository collects public BibTeX (`.bib`) files.

Preferably, libraries are collected using the `git` submodule feature.

## Collected libraries (git submodules)

| Path | Source | BibTeX files |
| --- | --- | --- |
| `jabref-jabref` | [jabref/jabref](https://github.com/jabref/jabref) | 224 (`*.bib`) |
| `latex-lsp-tree-sitter-bibtex` | [latex-lsp/tree-sitter-bibtex](https://github.com/latex-lsp/tree-sitter-bibtex) | [`examples/biblatex-examples.bib`](https://github.com/latex-lsp/tree-sitter-bibtex/blob/master/examples/biblatex-examples.bib) |
| `rvclayton-bibtex` | [rvclayton/bibtex](https://github.com/rvclayton/bibtex) | 14 (`*.bb`) |

> Note: if a library has ≤ 5 BibTeX files, the files are deep-linked individually;
> otherwise the count is shown. Some libraries use the `.bb` extension instead of
> `.bib`. Enumerate with `git ls-files --recurse-submodules '*.bib' '*.bb'`.

## Non-git available BibTeX files

These cannot be added as submodules. Entry counts are approximate / unverified.

| Source | Type | Entries (approx.) |
| --- | --- | --- |
| <https://ftp.math.utah.edu/pub/tex/bib/> | FTP mirror of `.bib` files | thousands of files |
| [dblp](https://dblp.uni-trier.de/) | CS bibliography, export per query | ~7M records |

## License

This README, scripts, ... is licensed using MIT.
All external content is licensed with the respective license.
