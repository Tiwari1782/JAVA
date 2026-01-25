# CH6 – Patterns Part 2 

This file contains **advanced pattern printing programs in Java**.  
It is a continuation of basic patterns and focuses on improving **loop logic**, **nested loops**, and **pattern visualization**.

All patterns are implemented inside a single Java class:  
`AdvancedPatterns.java`

---

##  File Structure

---

## Concepts Used
- Nested `for` loops
- Conditional statements (`if-else`)
- User input using `Scanner`
- Pattern symmetry and spacing logic

---

## 🛠 Patterns Implemented

###  Hollow Rectangle
Prints a rectangle where only the **boundary is filled with `*`**.

**Logic:**
- Print `*` when:
  - First row
  - Last row
  - First column
  - Last column
- Print space otherwise

---

###  Inverted & Rotated Half Pyramid
Creates a right-aligned half pyramid using `*`.

**Logic:**
- Print `(n - i)` spaces
- Print `i` stars

---

###  Inverted Half Pyramid with Numbers
Prints numbers starting from `1` in decreasing row length.

**Example (n = 5):**

---

###  Floyd’s Triangle
Prints consecutive numbers in a triangular form.

**Logic:**
- Use a counter variable
- Increment after every print

---

###  Zero-One Triangle
Prints a triangle of `0` and `1`.

**Rule:**
- If `(row + column)` is even → `1`
- Else → `0`

---

###  Butterfly Pattern 
A symmetric pattern divided into **two halves**.

**Structure:**
- First half: increasing stars
- Second half: decreasing stars
- Middle gap handled using spaces

---

###  Solid Rhombus
A slanted rectangle made of stars.

**Logic:**
- Print `(n - i)` spaces
- Print `n` stars

---

###  Hollow Rhombus
Similar to solid rhombus but only borders are stars.

**Logic:**
- Combination of:
  - Leading spaces
  - Hollow rectangle logic

---

###  Diamond Pattern 
A full diamond shape made using stars.

**Structure:**
- Upper pyramid
- Lower inverted pyramid

---

##  How to Run
1. Compile the program:
```bash
javac AdvancedPatterns.java
