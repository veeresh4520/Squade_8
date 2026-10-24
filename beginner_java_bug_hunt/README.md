# Java Bug Hunt — Open-Source Hackathon Starter

This repository contains intentionally faulty, plain-Java programs for issue-based debugging practice.

## Repository contents
- `src/main/java/hackathon/` — Java starter files.
- `issues/easy/`, `issues/medium/`, `issues/hard/`, `issues/very-hard/` — task descriptions grouped by difficulty.
- `ISSUES.md` — full issue index.
- `CONTRIBUTING.md` — contribution workflow.

## Requirements
- Java JDK 17 or later
- Git and a Java editor or terminal
- No external dependencies

Compile a single exercise from this directory using `javac src/main/java/hackathon/Issue01_EvenOdd.java`, then run it with `java -cp src/main/java/hackathon Issue01_EvenOdd`.

## Workflow
1. Read the assigned issue and reproduce the failure.
2. Fix only the assigned starter file unless the issue explicitly requires related changes.
3. Test the stated cases and at least one edge case.
4. Open one pull request per issue, describing the root cause and tests.

## Hard and Very Hard overnight challenges

- Hard: issues #41–#56 (16 issues)
- Very Hard: issues #57–#64 (8 issues)
- Issues are arranged in six scenario groups, with four related tasks per group.
- Each issue states the concrete task and expected output. The solution is not included.
- Very Hard tasks ask participants to implement missing methods from scratch using beginner Java topics.
- See [`VERY_HARD_ISSUES.md`](VERY_HARD_ISSUES.md) for all eight Very Hard descriptions in one file.

All challenge code uses basic Java constructs such as conditions, loops, arrays, strings, methods, classes, constructors, and object creation. No collections or external libraries are required.
