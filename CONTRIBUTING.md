# Contributing to MediTrack

Thank you for your interest in contributing to MediTrack, an open-source project that aims to streamline prescription management and medication adherence in healthcare settings. This document provides a step-by-step guide on how to set up the project, follow our coding standards, and make meaningful contributions.

## Project Setup

### Prerequisites
- Java 17 or higher
- Git
- Text editor or IDE (e.g., VSCode, IntelliJ, NetBeans)
- JUnit (for testing)

### Installation

1. **Fork the Repository**  
   Click the "Fork" button on the top right of the repository page to create your own copy.

2. **Clone Your Fork**  
   ```bash
   git clone https://github.com/your-username/MediTrack.git
   cd MediTrack
   ```

3. **Compile the Project**  
   ```bash
   mkdir -p out
   find src -name "*.java" > sources.txt
   javac -d out @sources.txt
   ```

4. **Run Tests** (if configured)  
   Insert your JUnit test runner or Gradle/Maven setup as applicable.


## Coding Standards

- Use meaningful variable and method names.
- Follow standard Java conventions (indentation, braces, spacing).
- Comment your code where necessary — especially for complex logic.
- Keep classes focused and concise (single responsibility principle).
- Add at least one unit test for each new feature or bug fix.

## How to Contribute

### Picking an Issue
- Look under the [Issues](../../issues) tab.
- Choose items labeled `good-first-issue` or `feature-request`.

### Submitting Changes
1. **Create a branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Write code and tests** in your branch.

3. **Commit your changes:**
   ```bash
   git add .
   git commit -m "Add feature: your feature description"
   ```

4. **Push to your fork:**
   ```bash
   git push origin feature/your-feature-name
   ```

5. **Submit a Pull Request:**
   - Go to your fork on GitHub and click "Compare & Pull Request"
   - Add a clear description and any screenshots if needed

### Review & Merge
- One project maintainer will review your PR.
- If it passes review and automated tests, it will be merged.

## Repository Rules

- All commits to `main` must be made through a pull request.
- PRs must pass GitHub Actions CI checks before merging.
- Force pushes to `main` are disabled to protect project history.

## Thank You

We appreciate every contribution. Whether it’s fixing a bug, forking or starring the repo, or proposing a new feature — your help makes MediTrack better!

