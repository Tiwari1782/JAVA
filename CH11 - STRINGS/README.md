# Java String Manipulation Examples

This repository contains various examples, explanations, and questions on string manipulation in Java. It covers major and minor topics like palindrome detection, shortest path algorithms, custom substring extraction, proper upper-casing of sentences, string compression, and basic input/output string operations.

## Table of Contents

- [Getting Started](#getting-started)
- [Topics Covered](#topics-covered)
  - [1. Print Letters](#1-print-letters)
  - [2. Palindromic String](#2-palindromic-string)
  - [3. Shortest Path](#3-shortest-path)
  - [4. Substring Extraction](#4-substring-extraction)
  - [5. To Upper Case Each Word](#5-to-upper-case-each-word)
  - [6. String Compression](#6-string-compression)
  - [7. String Input, Output, & Properties](#7-string-input-output--properties)
  - [8. Comparison and Immutability](#8-comparison-and-immutability)
  - [9. StringBuilder Usage](#9-stringbuilder-usage)
  - [10. String Array Operations](#10-string-array-operations)
- [Practice Questions](#practice-questions)
- [How to Run](#how-to-run)

## Getting Started

Clone this repository and open the `Strings.java` file to see all the methods and their sample usage in the `main` function. Each method demonstrates an important string operation or algorithm useful for interviews and general coding practice.

---

## Topics Covered

### 1. Print Letters

Prints each character of a string with a space.

```java
public static void printLetters(String str) {
    for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
    }
}
// Output for "hello": h e l l o 
```

### 2. Palindromic String

Checks if a string is a palindrome (reads the same backward).

```java
public static boolean validPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
        int n = str.length();
        if (str.charAt(i) != str.charAt(n - 1 - i)) {
            return false;
        }
    }
    return true;
}
```
**Usage:**
```java
String str = "racecar";
System.out.println(validPalindrome(str)); // true
```
**Explanation:**  
Compares characters from both ends. If all pairs match, the string is a palindrome.

---

### 3. Shortest Path

Determines the shortest straight-line distance from origin given a sequence of moves (N,E,S,W).

```java
public static float getPath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
        char direction = path.charAt(i);
        if (direction == 'S') y--;
        else if (direction == 'N') y++;
        else if (direction == 'W') x--;
        else if (direction == 'E') x++;
    }
    return (float) Math.sqrt(x * x + y * y);
}
```
**Usage:**
```java
String path = "WNEENESENNN";
System.out.println(getPath(path));
```
**Explanation:**  
Counts net displacement in x and y and applies the distance formula.

---

### 4. Substring Extraction

Extracts a substring using a custom implementation (without using Java's inbuilt function).

```java
public static String substring(String str, int start, int end) {
    String substr = "";
    for (int i = start; i < end; i++) {
        substr += str.charAt(i);
    }
    return substr;
}
```
**Usage:**
```java
String str = "Hello World";
System.out.println(substring(str, 0, 5)); // Hello
```
**Explanation:**  
Loops through index range and builds a new substring.

---

### 5. To Upper Case Each Word

Capitalizes the first letter of each word.

```java
public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' ' && i < str.length() - 1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
```
**Usage:**
```java
String str = "hii, i am sadie";
System.out.println(toUpperCase(str)); // "Hii, I Am Sadie"
```
**Explanation:**  
Detects spaces and capitalizes the following character.

---

### 6. String Compression

Compresses repeated consecutive characters, e.g., `"aabbbcc"` becomes `"a2b3c2"`.

```java
public static String compress(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
        Integer count = 1;
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count > 1){
            newStr += count.toString();
        }
    }
    return newStr;
}
```
**Usage:**
```java
String str = "aaabbcccdd";
System.out.println(compress(str)); // "a3b2c3d2"
```
---

### 7. String Input, Output & Properties

- **Take input using `Scanner.next()` and `nextLine()`**
- **Get length with `.length()`**
- **Concatenate with `+` operator**
- **Access character at index with `.charAt(index)`**

---

### 8. Comparison and Immutability

- `==` compares reference, `.equals()` compares values
- Strings are **immutable**: once created, they can't be changed.

```java
String s1 = "Tony";
String s2 = new String("Tony");
System.out.println(s1 == s2);       // false
System.out.println(s1.equals(s2));  // true
```

---

### 9. StringBuilder Usage

Efficient alternative for string concatenations (mutable sequence).

```java
StringBuilder sb = new StringBuilder();
for(char ch = 'a'; ch <= 'z'; ch++){
    sb.append(ch);
}
System.out.println(sb); // "abcdefghijklmnopqrstuvwxyz"
```

---

### 10. String Array Operations

Finding the largest string in a string array using `compareTo`.

```java
String fruits[] = { "apple", "mango", "banana" };
String largest = fruits[0];
for (int i = 1; i < fruits.length; i++) {
    if (largest.compareTo(fruits[i]) < 0) {
        largest = fruits[i];
    }
}
System.out.println(largest); // mango
```

---

## Practice Questions

1. **Palindrome Check:**  
   Implement a function to check if a string is a palindrome.

2. **Shortest Path:**  
   Given a path string with moves (N, S, E, W), compute shortest straight-line distance.

3. **String Compression:**  
   Compress repeated characters, e.g., "aaabb" → "a3b2".

4. **Capitalize Words:**  
   Convert a sentence so the first letter of each word is upper case.

5. **Substring Extraction:**  
   Implement your own `substring` function using loops.

6. **Compare Strings:**  
   Demonstrate `.equals()` and `==` differences with string literals and objects.

---

## How to Run

1. Clone the repository.
2. Compile and run `Strings.java`:
    ```sh
    javac Strings.java
    java Strings
    ```
3. Uncomment any section in `main()` to test various functionalities.

---

## Contributions

Feel free to fork and add more string operations or interview-style questions!