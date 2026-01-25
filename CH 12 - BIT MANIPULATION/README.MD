# Bit Manipulation: Concepts and Techniques (Java Version)

Bit manipulation is an essential skill in programming, especially for optimizing solutions in competitive programming, algorithms, and systems design. This guide covers the binary number system, bitwise operators, and practical bit manipulation tricks using **Java**—with explanations, sample code, and use cases.

---

## Table of Contents

1. [Introduction to Bit Manipulation](#introduction-to-bit-manipulation)
2. [Binary Number System](#binary-number-system)
3. [Bitwise Operators](#bitwise-operators)
    - [Binary AND (`&`)](#binary-and-&)
    - [Binary OR (`|`)](#binary-or-|)
    - [Binary XOR (`^`)](#binary-xor-^)
    - [Binary 1's Complement (`~`)](#binary-1s-complement-~)
    - [Binary Left Shift (`<<`)](#binary-left-shift-<<)
    - [Binary Right Shift (`>>`)](#binary-right-shift->>)
4. [Common Bit Manipulation Tricks](#common-bit-manipulation-tricks)
    - [Check if Odd or Even](#check-if-odd-or-even)
    - [Get ith Bit](#get-ith-bit)
    - [Set ith Bit](#set-ith-bit)
    - [Clear ith Bit](#clear-ith-bit)
    - [Update ith Bit](#update-ith-bit)
    - [Clear Last i Bits](#clear-last-i-bits)
    - [Clear Range of Bits](#clear-range-of-bits)
    - [Check if Number is Power of 2](#check-if-number-is-power-of-2)
    - [Count Set Bits in a Number](#count-set-bits-in-a-number)
    - [Fast Exponentiation](#fast-exponentiation)

---

## Introduction to Bit Manipulation

Bit manipulation refers to algorithmic operations on individual bits within integers. These operations are key for tasks like optimization, compression, encryption, and low-level hardware interaction.

---

## Binary Number System

In binary (base-2), numbers use only 0 and 1. Each digit is a bit and represents a power of 2.

Example:  
`13` in binary is `1101`  
`8 + 4 + 0 + 1 = 13`

---

## Bitwise Operators

### Binary AND `&`

ANDs each pair of bits. Useful for masking bits.

| a | b | a & b |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |

**Java Example:**
```java
int a = 5;   // 0101
int b = 3;   // 0011
int c = a & b; // 0001 => 1
```

---

### Binary OR `|`

ORs each pair of bits.

| a | b | a \| b |
|---|---|--------|
| 0 | 0 |   0    |
| 0 | 1 |   1    |
| 1 | 0 |   1    |
| 1 | 1 |   1    |

**Java Example:**
```java
int a = 5;   // 0101
int b = 3;   // 0011
int c = a | b; // 0111 => 7
```

---

### Binary XOR `^`

Exclusive OR: 1 where bits are different.

| a | b | a ^ b |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   1   |
| 1 | 0 |   1   |
| 1 | 1 |   0   |

**Java Example:**
```java
int a = 5;   // 0101
int b = 3;   // 0011
int c = a ^ b; // 0110 => 6
```

---

### Binary 1's Complement `~`

Flips every bit (0 becomes 1, 1 becomes 0).

**Java Example:**
```java
int a = 5;    // 0000 0101
int c = ~a;   // 1111...1010 (two's complement representation)
```

---

### Binary Left Shift `<<`

Shifts all bits to the left by n positions. Each left shift multiplies the number by 2.

**Java Example:**
```java
int a = 5;    // 0000 0101
int c = a << 1; // 0000 1010 => 10
```

---

### Binary Right Shift `>>`

Shifts all bits to the right. Each right shift divides by 2.

**Java Example:**
```java
int a = 5;    // 0000 0101
int c = a >> 1; // 0000 0010 => 2
```

---

## Common Bit Manipulation Tricks

### Check if Odd or Even

Odd: Last bit is 1  
Even: Last bit is 0

```java
if ((n & 1) != 0) {
    // n is odd
} else {
    // n is even
}
```

---

### Get ith Bit

Returns value of the ith bit (0-indexed).

```java
int getIthBit(int n, int i) {
    return (n >> i) & 1;
}
```

---

### Set ith Bit

Sets the ith bit to 1.

```java
int setIthBit(int n, int i) {
    return n | (1 << i);
}
```

---

### Clear ith Bit

Sets the ith bit to 0.

```java
int clearIthBit(int n, int i) {
    int mask = ~(1 << i);
    return n & mask;
}
```

---

### Update ith Bit

Sets the ith bit to value `v` (0 or 1).

```java
int updateIthBit(int n, int i, int v) {
    n = clearIthBit(n, i);
    return n | (v << i);
}
```

---

### Clear Last i Bits

Removes the last i bits (sets them to 0).

```java
int clearLastIBits(int n, int i) {
    int mask = (~0) << i;
    return n & mask;
}
```

---

### Clear Range of Bits

Clears all bits from position i to j (inclusive).

```java
int clearRangeItoJ(int n, int i, int j) {
    int a = (~0) << (j + 1);
    int b = (1 << i) - 1;
    int mask = a | b;
    return n & mask;
}
```

---

### Check If Number Is Power of 2

True if only one bit is set.

```java
boolean isPowerOf2(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
```

---

### Count Set Bits in a Number

Naive approach:

```java
int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        count += n & 1;
        n >>= 1;
    }
    return count;
}
```
Brian Kernighan's algorithm (faster):

```java
int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        n = n & (n - 1);
        count++;
    }
    return count;
}
```

---

### Fast Exponentiation

Compute a^b efficiently using bits (O(log b)).

```java
int fastExp(int a, int b) {
    int result = 1;
    while (b > 0) {
        if ((b & 1) != 0) result *= a;
        a *= a;
        b >>= 1;
    }
    return result;
}
```

---

## Conclusion

Bit manipulation leverages the power of binary logic for fast, low-level operations. Mastering these techniques will make you a more efficient and resourceful programmer!

---