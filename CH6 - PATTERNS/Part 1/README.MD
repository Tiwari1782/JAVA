# Pattern Printing with Nested Loops

This repository covers basic pattern-printing problems in programming, focused on understanding **nested loops** and how to use them to print different patterns using characters (mostly `*` and alphabets).

## Topics Covered

1. [Intro to Nested Loops (Star Pattern)](#1-intro-to-nested-loops-star-pattern)
2. [Inverted Star Pattern](#2-inverted-star-pattern)
3. [Half Pyramid Pattern](#3-half-pyramid-pattern)
4. [Character Pattern](#4-character-pattern)
5. [Special Note](#5-special-note)

---

## 1. Intro to Nested Loops (Star Pattern)

In this section, we learn:

- What **nested loops** are.
- How the **outer loop** controls the number of rows.
- How the **inner loop** controls the number of columns (or characters printed per row).
- Printing a basic **solid star pattern**, e.g.:

For `n = 4`:

```text
****
****
****
****
```

Key ideas:

- Outer loop runs `n` times (for each row).
- Inner loop runs `n` times (for each column/`*` to be printed in that row).
- Understanding loop flow (which loop finishes first, how indices change).

---

## 2. Inverted Star Pattern

Here we use nested loops to print a **decreasing** or **inverted** star pattern.

For example, for `n = 5`:

```text
*****
****
***
**
*
```

Concepts:

- Outer loop: number of rows.
- Inner loop: starts from `n` and decreases every row.
- Understanding how changing loop limits changes the shape of the pattern.

---

## 3. Half Pyramid Pattern

This section focuses on building patterns that **grow** row by row:

For `n = 5`:

```text
*
**
***
****
*****
```

What you will practice:

- Printing a **left-aligned half pyramid**.
- Relationship between the **current row number** and the **number of stars**.
- Variations you can try:
  - Half pyramid with numbers instead of stars.
  - Half pyramid with spaces added for alignment (stepping towards full pyramid).

---

## 4. Character Pattern

Instead of only using `*`, we print **characters (letters)** in different ways.

Examples:

### Example 1: Repeating same character in each row

```text
AAAA
BBBB
CCCC
DDDD
```

### Example 2: Increasing sequence of characters

```text
A
AB
ABC
ABCD
```

What you learn:

- Using characters with loops.
- Converting between character and its ASCII/Unicode value (depending on language).
- Controlling which character gets printed on each row/column.

---

## 5. Special Note

- These patterns are mainly to **strengthen your logic-building** and **control over loops**.
- Try to:
  - Dry run your code on paper for small values of `n`.
  - Predict the output before running the program.
  - Experiment with different characters, numbers, and pattern shapes (diamonds, full pyramids, hollow patterns, etc.).

You can implement all these patterns in any programming language of your choice (C, C++, Java, Python, JavaScript, etc.) as long as you understand how loops work.

---

## How to Use This Repository

1. Open the file for the pattern you want to understand (e.g., `nested_loops_star_pattern`, `inverted_star_pattern`, etc.).
2. Read the comments in the code to understand the logic.
3. Run the program with different values of `n`.
4. Try modifying the patterns or create your own based on the same concepts.

Happy coding and pattern practicing! 🚀