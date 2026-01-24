# 1D Arrays in Java: From Basics to Advanced

This guide covers the essentials and advanced concepts of **one-dimensional (1D) arrays** in Java. If you’re just starting or preparing for coding interviews, this README will take you step by step, from array creation and traversals, to more complex operations like subarrays, prefix sums, and advanced algorithms like Kadane’s Algorithm.

---

## Table of Contents

- [1. Introduction to 1D Arrays](#1-introduction-to-1d-arrays)
- [2. Array Declaration, Initialization, and Input](#2-array-declaration-initialization-and-input)
- [3. Traversing and Basic Operations](#3-traversing-and-basic-operations)
- [4. Common Array Tasks](#4-common-array-tasks)
  - [4.1 Find Maximum/Minimum](#41-find-maximumminimum)
  - [4.2 Sum and Average](#42-sum-and-average)
  - [4.3 Searching (Linear, Binary)](#43-searching-linear-binary)
- [5. Subarrays](#5-subarrays)
  - [5.1 All Subarrays](#51-all-subarrays)
  - [5.2 Maximum Subarray Sum (Brute Force)](#52-maximum-subarray-sum-brute-force)
- [6. Prefix Sums](#6-prefix-sums)
  - [6.1 Subarray Sum Using Prefix Sums](#61-subarray-sum-using-prefix-sums)
- [7. Advanced: Kadane's Algorithm (Max Subarray)](#7-advanced-kadanes-algorithm-max-subarray)
- [8. Practice Tips & Tricks](#8-practice-tips--tricks)
- [9. References](#9-references)

---

## 1. Introduction to 1D Arrays

A **1D array** is a collection of variables of the same type, stored at contiguous memory locations. Arrays are fixed in size after creation.

**Example**:

```java
int[] arr = new int[5]; // creates array of size 5
int[] arr2 = {1, 2, 3, 4, 5}; // initializes with values
```

---

## 2. Array Declaration, Initialization, and Input

```java
// Declaration
int[] arr;
arr = new int[5];

// Initialization
arr[0] = 10; arr[1] = 20; /* ... */

// Direct initialization
int[] arr2 = {1, 2, 3, 4, 5};

// Input from user
Scanner sc = new Scanner(System.in);
for(int i=0; i<arr.length; i++) {
    arr[i] = sc.nextInt();
}
```

---

## 3. Traversing and Basic Operations

Print all elements:

```java
for(int i=0; i<arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```
Or using enhanced for-loop:
```java
for(int value : arr) {
    System.out.print(value + " ");
}
```

---

## 4. Common Array Tasks

### 4.1 Find Maximum/Minimum

```java
int max = arr[0];
int min = arr[0];
for(int i=1; i<arr.length; i++) {
    if(arr[i]>max) max = arr[i];
    if(arr[i]<min) min = arr[i];
}
```

### 4.2 Sum and Average

```java
int sum = 0;
for(int num: arr) sum += num;
double avg = (double) sum / arr.length;
```

### 4.3 Searching (Linear, Binary)

**Linear search (works on any array):**
```java
int target = 15, idx = -1;
for(int i=0; i<arr.length; i++) {
    if(arr[i]==target) { idx = i; break; }
}
```
**Binary search (array must be sorted):**
```java
int low=0, high=arr.length-1, key=10;
while(low<=high){
    int mid=(low+high)/2;
    if(arr[mid]==key) { /* found */ }
    else if(arr[mid]<key) low=mid+1;
    else high=mid-1;
}
```

---

## 5. Subarrays

A **subarray** is a contiguous block of the original array.

Example:  
For `[1, 2, 3]`, subarrays are `[1]`, `[2]`, `[3]`, `[1,2]`, `[2,3]`, `[1,2,3]`

### 5.1 All Subarrays

Print all subarrays:

```java
for(int i=0; i<arr.length; i++) {
    for(int j=i; j<arr.length; j++) {
        for(int k=i; k<=j; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
```

### 5.2 Maximum Subarray Sum (Brute Force, O(n³))

```java
int maxSum = Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++) {
    for(int j=i; j<arr.length; j++) {
        int sum = 0;
        for(int k=i; k<=j; k++) {
            sum += arr[k];
        }
        if(sum > maxSum) maxSum = sum;
    }
}
System.out.println("Maximum subarray sum: " + maxSum);
```

---

## 6. Prefix Sums

A **prefix sum array** stores at each index the sum of all elements before it.

**Building prefix sum:**
```java
int[] prefix = new int[arr.length];
prefix[0] = arr[0];
for(int i=1; i<arr.length; i++) {
    prefix[i] = prefix[i-1] + arr[i];
}
```
### 6.1 Subarray Sum Using Prefix Sums

Sum of subarray `arr[i..j]` is:
- If i == 0: `prefix[j]`
- Else: `prefix[j] - prefix[i-1]`

```java
int i = 2, j = 4; // for example
int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
System.out.println("Sum = " + sum);
```

---

## 7. Advanced: Kadane's Algorithm (Max Subarray, O(n))

Kadane’s Algorithm efficiently finds the maximum subarray sum in linear time:

```java
int maxSoFar = arr[0], currMax = arr[0];
for(int i=1; i<arr.length; i++) {
    currMax = Math.max(arr[i], currMax + arr[i]);
    maxSoFar = Math.max(maxSoFar, currMax);
}
System.out.println("Max subarray sum is " + maxSoFar);
```

**Example:**  
Input: `[-2,1,-3,4,-1,2,1,-5,4]`  
Output: `6` (subarray `[4,-1,2,1]`)

---

## 8. Practice Tips & Tricks

- Arrays in Java are **zero-indexed**.
- Array size is **fixed after creation**.
- Always check for **array bounds** before accessing `arr[i]`.
- Practice the difference between **subarray** (contiguous) and **subset** (can be non-contiguous).
- For interview prep, solve problems involving rotations, reversals, and searching for patterns in arrays.

---

## 9. References

- [Java Arrays - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Prefix Sum & Kadane’s Algorithm - GeeksforGeeks](https://www.geeksforgeeks.org/kadanes-algorithm-maximum-subarray-sum-in-an-array/)
- [Array Subarrays - Leetcode Problems](https://leetcode.com/tag/array/)

---

*Arrays are the building blocks of programming and mastering their tricks is key to solving real-world and interview problems!*