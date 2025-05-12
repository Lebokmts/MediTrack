# Branch Protection Rules for MediTrack

To ensure code quality, consistency, and stability, the `main` branch of the MediTrack repository is protected using GitHub's **branch ruleset**.

This configuration is part of our CI/CD strategy to reduce bugs, enforce team collaboration, and guarantee that only tested code reaches production.


## Active Rules for `main`

| Rule | Description |
|------|-------------|
| **Require pull request before merging** | Ensures that all code must be peer-reviewed and submitted via a pull request. No direct commits allowed. |
| **Require status checks to pass** | Automatically runs tests using GitHub Actions. Code cannot be merged unless tests pass. |
| **Block force pushes** | Prevents rewriting of history on the `main` branch, maintaining a clean and traceable commit log. |
| **Restrict deletions** | Prevents accidental or unauthorized deletion of the `main` branch. |

---

## Why These Rules Matter

-  **Quality Control**: Only reviewed and tested code is allowed into `main`, reducing production bugs.
-  **CI/CD Integration**: Status checks enforce that all unit tests and build processes must succeed before merge.
-  **Traceability**: Blocking force pushes and deletions ensures every change is traceable and reversible.
-  **Team Collaboration**: Pull requests encourage team members to review, suggest improvements, and document decisions.

---

## Future Enhancements

As the MediTrack project matures, we may also:
- Enable **required code scanning results** (security)
- Add **signed commits** for verified authorship
- Configure **deployment environments** for auto-release gating

---

These protections support a reliable development process and ensure that MediTrack evolves safely and collaboratively.
