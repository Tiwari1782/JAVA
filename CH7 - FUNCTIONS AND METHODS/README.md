# Java Functions / Methods – Quick Reference

This README gives a quick overview of **methods in Java** with short explanations of common topics and example use‑cases.

---

## Table of Contents 

1. [Functions / Methods](#1-functionsmethods)
2. [Syntax – Function Code / Demo](#2-syntax--function-codedemo)
3. [Syntax with Parameters](#3-syntax-with-parameters)
4. [Parameters vs Arguments](#4-parameters-vs-arguments)
5. [What Happens in Memory? (Call Stack)](#5-what-happens-in-memory-call-stack)
6. [Call by Value (in Java)](#6-call-by-value-in-java)
7. [Product of `a` & `b`](#7-product-of-a--b)
8. [Find Factorial](#8-find-factorial)
9. [Find Binomial Coefficient](#9-find-binomial-coefficient)
10. [Inbuilt vs User‑Defined Methods](#10-inbuilt-vs-user-defined-methods)
11. [Function Overloading](#11-function-overloading)
12. [Overloading Using Parameters](#12-overloading-using-parameters)
13. [Overloading Using Data Types](#13-overloading-using-data-types)
14. [Check if a Number is Prime or Not](#14-check-if-a-number-is-prime-or-not)
15. [Check Prime (Optimised)](#15-check-prime-optimised)
16. [Primes in a Range](#16-primes-in-range)
17. [Binary to Decimal](#17-binary-to-decimal)
18. [Code: Binary to Decimal](#18-code-binary-to-decimal)
19. [Decimal to Binary](#19-decimal-to-binary)
20. [Method Scope](#20-method-scope)
21. [Block Scope](#21-block-scope)

---

## 1. Functions/Methods

In Java, **methods** (often called functions in other languages) are reusable blocks of code that perform a specific task.  
They help avoid repetition and make programs modular and easier to understand.

---

## 2. Syntax – Function Code/Demo

Basic method syntax in Java:

```java
returnType methodName() {
    // code
    return value; // if returnType is not void
}
```

Example:

```java
int add() {
    int a = 5, b = 10;
    return a + b;
}
```

---

## 3. Syntax with Parameters

Methods can take **parameters** to work with different input values.

```java
returnType methodName(type1 param1, type2 param2) {
    // use param1, param2
    return value;
}
```

Example:

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 4. Parameters vs Arguments

- **Parameters** are the variables listed in the method definition.  
- **Arguments** are the actual values you pass when calling the method.

```java
int add(int a, int b) { // a, b = parameters
    return a + b;
}

int sum = add(3, 4);    // 3, 4 = arguments
```

---

## 5. What Happens in Memory? (Call Stack)

When a method is called:

1. A **stack frame** is created in the **call stack** for that method.
2. Parameters and local variables are stored inside this frame.
3. After the method finishes, its stack frame is removed and control returns to the caller.

This LIFO (Last In, First Out) structure helps Java track which method is currently running.

---

## 6. Call by Value (in Java)

Java is strictly **call by value**:

- For primitives (e.g., `int`, `double`), the actual value is copied.
- For objects, the **reference value** (address) is copied, but it is still call by value of the reference.

Changing a primitive parameter inside a method does **not** change the original variable in the caller.

---

## 7. Product of `a` & `b`

A simple method to return the product of two numbers:

```java
int product(int a, int b) {
    return a * b;
}
```

Use this to quickly compute multiplication using a reusable method.

---

## 8. Find Factorial

Factorial of `n` (`n!`) is the product of all positive integers up to `n`.

Iterative version:

```java
int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
```

Can also be written using recursion, but iterative is simpler for beginners.

---

## 9. Find Binomial Coefficient

The binomial coefficient `C(n, r)` is:

\[
C(n, r) = \frac{n!}{r! \times (n-r)!}
\]

Example using the `factorial` method:

```java
int binomialCoeff(int n, int r) {
    int factN = factorial(n);
    int factR = factorial(r);
    int factNR = factorial(n - r);
    return factN / (factR * factNR);
}
```

---

## 10. Inbuilt vs User Defined Methods

- **Inbuilt methods** are provided by Java libraries (e.g., `Math.max()`, `System.out.println()`).
- **User‑defined methods** are created by you for your specific logic (e.g., `factorial()`, `isPrime()`).

Using both effectively helps you write clean, efficient code.

---

## 11. Function Overloading

**Function (method) overloading** means creating multiple methods with the **same name** but **different parameter lists**.

- The compiler decides which method to call based on the number and types of arguments.
- Overloading increases readability and flexibility.

---

## 12. Overloading Using Parameters

Same method name, but different **number of parameters**:

```java
int sum(int a, int b) {
    return a + b;
}

int sum(int a, int b, int c) {
    return a + b + c;
}
```

The call `sum(2, 3)` uses the first method, while `sum(2, 3, 4)` uses the second.

---

## 13. Overloading Using Data Types

Same method name and parameter count, but **different data types**:

```java
int multiply(int a, int b) {
    return a * b;
}

double multiply(double a, double b) {
    return a * b;
}
```

The appropriate version is chosen based on argument types (`int` vs `double`).

---

## 14. Check if a Number is Prime or Not

A basic (non‑optimized) prime check:

```java
boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

This checks divisibility from `2` to `n-1`.

---

## 15. Check Prime (Optimised)

Optimized prime check using `i * i <= n` (only up to square root):

```java
boolean isPrimeOptimised(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

This greatly reduces the number of iterations for large `n`.

---

## 16. Primes in Range

To print all primes in a range `[start, end]`, reuse the `isPrimeOptimised` method:

```java
void printPrimesInRange(int start, int end) {
    for (int i = start; i <= end; i++) {
        if (isPrimeOptimised(i)) {
            System.out.print(i + " ");
        }
    }
}
```

This demonstrates how methods can call other methods to build more complex logic.

---

## 17. Binary to Decimal

To convert a binary number (e.g., `1011`) to decimal, multiply each bit by powers of 2 from right to left.

Idea:

- Start from the least significant bit.
- Maintain a `base = 1` (which represents `2^0`, then `2^1`, etc.).
- Add `lastDigit * base` to the result and update `base *= 2`.

---

## 18. Code Binary to Decimal

Example implementation where the binary number is given as an integer:

```java
int binaryToDecimal(int binary) {
    int decimal = 0;
    int base = 1; // 2^0

    while (binary > 0) {
        int lastDigit = binary % 10;
        decimal += lastDigit * base;
        base *= 2;
        binary /= 10;
    }
    return decimal;
}
```

---

## 19. Decimal to Binary

To convert decimal to binary:

- Repeatedly divide the number by 2.
- Collect the remainders.
- The binary number is the sequence of remainders read in reverse.

Example:

```java
int decimalToBinary(int n) {
    int binary = 0;
    int place = 1;

    while (n > 0) {
        int rem = n % 2;
        binary += rem * place;
        place *= 10;
        n /= 2;
    }
    return binary;
}
```

---

## 20. Method Scope

**Method scope**: variables declared *inside a method* are local to that method.

- They cannot be accessed from outside the method.
- They are created when the method is called and destroyed when it finishes.

```java
void demo() {
    int x = 10; // x has method scope
    System.out.println(x);
}
// x is not accessible here
```

---

## 21. Block Scope

**Block scope**: variables declared inside `{ }` (like loops or `if` blocks) are limited to that block.

```java
void scopeExample() {
    if (true) {
        int y = 20; // y has block scope
        System.out.println(y);
    }
    // y is NOT accessible here
}
```

Block scope helps avoid name clashes and keeps variables as local as possible.

---

You can use these short notes as a quick reference while coding or revising Java methods. Try implementing each concept in a separate Java file or class and experiment with different inputs.