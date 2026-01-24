# Sorting Algorithms in Java

This repository contains simple, well-commented Java code for four fundamental sorting algorithms—**Bubble Sort**, **Selection Sort**, **Insertion Sort**, and **Counting Sort**—with explanations and step-by-step dry runs. If you're learning sorting algorithms, use this as a study guide to understand the inner workings of each technique!

---

## Table of Contents

- [Bubble Sort](#1-bubble-sort)
  - [What is Bubble Sort?](#what-is-bubble-sort)
  - [How Does It Work?](#how-does-bubble-sort-work)
  - [Step-by-step Example](#bubble-sort-dry-run)
- [Selection Sort](#2-selection-sort)
- [Insertion Sort](#3-insertion-sort)
- [Counting Sort](#4-counting-sort)
- [How to Use](#how-to-use)
- [Summary Table](#summary-table)

---

## 1. Bubble Sort

### What is Bubble Sort?

Bubble Sort is a simple comparison-based algorithm. It works by repeatedly stepping through the list, comparing each pair of adjacent elements, and swapping them if they are in the wrong order. This process keeps moving larger elements to the end (like bubbles rising to the surface), hence the name "Bubble Sort".

### How does Bubble Sort Work?

- Start with the first element of the array.
- Compare two adjacent elements.
- If the first is greater than the second, swap them.
- Repeat for all elements, and repeat the process for all passes (n-1 times for an array of length n).
- After every pass, the next largest element is correctly positioned at the end.

### Bubble Sort Dry Run

Given: `arr = [5, 4, 1, 3, 2]`

**Pass 1:**
- Compare 5 & 4 ➜ Swap ➜ `[4, 5, 1, 3, 2]`
- Compare 5 & 1 ➜ Swap ➜ `[4, 1, 5, 3, 2]`
- Compare 5 & 3 ➜ Swap ➜ `[4, 1, 3, 5, 2]`
- Compare 5 & 2 ➜ Swap ➜ `[4, 1, 3, 2, 5]`  
(5 is at right position)

**Pass 2:**
- Compare 4 & 1 ➜ Swap ➜ `[1, 4, 3, 2, 5]`
- Compare 4 & 3 ➜ Swap ➜ `[1, 3, 4, 2, 5]`
- Compare 4 & 2 ➜ Swap ➜ `[1, 3, 2, 4, 5]`
- (No need to check the last pair because 5 is already settled)

**Pass 3:**
- Compare 1 & 3 ➜ No swap
- Compare 3 & 2 ➜ Swap ➜ `[1, 2, 3, 4, 5]`
- (Now 4 is in right position)

**Pass 4:**
- Compare 1 & 2 ➜ No swap
- (Rest already sorted)

**Result:**
`[1, 2, 3, 4, 5]`

---

## 2. Selection Sort

### What is Selection Sort?

Selection sort divides the array into two parts: the sorted part at the front, and the unsorted part at the back. It repeatedly selects the smallest element from the unsorted part and moves it to the end of the sorted part.

### How does Selection Sort Work?

- Find the smallest element in the unsorted part.
- Swap it with the first element in the unsorted part.
- Move the boundary between sorted and unsorted part one step right.
- Repeat until the array is sorted.

### Selection Sort Dry Run

Given: `arr = [5, 4, 1, 3, 2]`

**Pass 1 (i=0):**
- Minimum from index 0–4 is 1 (at index 2)
- Swap arr[0] & arr[2]: `[1, 4, 5, 3, 2]`

**Pass 2 (i=1):**
- Minimum from index 1–4 is 2 (at index 4)
- Swap arr[1] & arr[4]: `[1, 2, 5, 3, 4]`

**Pass 3 (i=2):**
- Minimum from index 2–4 is 3 (at index 3)
- Swap arr[2] & arr[3]: `[1, 2, 3, 5, 4]`

**Pass 4 (i=3):**
- Minimum from index 3–4 is 4 (at index 4)
- Swap arr[3] & arr[4]: `[1, 2, 3, 4, 5]`

**Result:**
`[1, 2, 3, 4, 5]`

---

## 3. Insertion Sort

### What is Insertion Sort?

Insertion Sort builds the sorted array one value at a time by repeatedly picking the next value and inserting it into its correct position among the already-sorted values.

### How does Insertion Sort Work?

- Start at the first unsorted element.
- Compare it with elements on the left.
- Shift all larger elements one position to the right.
- Insert the current element in the correct position.
- Repeat for all elements.

### Insertion Sort Dry Run

Given: `arr = [5, 4, 1, 3, 2]`

**Step 1 (i=1, curr=4):**
- Compare 4 < 5 ➜ Shift 5 ➜ `[5, 5, 1, 3, 2]`
- Insert 4 ➜ `[4, 5, 1, 3, 2]`

**Step 2 (i=2, curr=1):**
- Compare 1 < 5 ➜ Shift 5 ➜ `[4, 5, 5, 3, 2]`
- Compare 1 < 4 ➜ Shift 4 ➜ `[4, 4, 5, 3, 2]`
- Insert 1 ➜ `[1, 4, 5, 3, 2]`

**Step 3 (i=3, curr=3):**
- Compare 3 < 5 ➜ Shift 5 ➜ `[1, 4, 5, 5, 2]`
- Compare 3 < 4 ➜ Shift 4 ➜ `[1, 4, 4, 5, 2]`
- Insert 3 ➜ `[1, 3, 4, 5, 2]`

**Step 4 (i=4, curr=2):**
- Compare 2 < 5 ➜ Shift 5 ➜ `[1, 3, 4, 5, 5]`
- Compare 2 < 4 ➜ Shift 4 ➜ `[1, 3, 4, 4, 5]`
- Compare 2 < 3 ➜ Shift 3 ➜ `[1, 3, 3, 4, 5]`
- Insert 2 ➜ `[1, 2, 3, 4, 5]`

**Result:**
`[1, 2, 3, 4, 5]`

---

## 4. Counting Sort

### What is Counting Sort?

Counting Sort is a non-comparison sorting algorithm ideal for sorting non-negative integers when the range of values (max - min) is not too large. It works by counting occurrences of each value and calculating correct positions for each element.

### How Does Counting Sort Work?

- Find the largest element in the array.
- Create a count array for all elements up to the largest value.
- Count how many times each value occurs.
- For each value, fill the original array according to the count.

### Counting Sort Dry Run

Given: `arr = [1, 4, 1, 3, 2, 4, 3, 7]`

1. Largest element is 7  
2. Create a `count` array of length 8 (indexes 0 to 7)
   - Initial count: `[0,0,0,0,0,0,0,0]`
3. Count occurrences for each number:
   - For 1: increment count[1] x2 ➜ `count[1]=2`
   - For 2: increment count[2] x1 ➜ `count[2]=1`
   - For 3: increment count[3] x2 ➜ `count[3]=2`
   - For 4: increment count[4] x2 ➜ `count[4]=2`
   - For 7: increment count[7] x1 ➜ `count[7]=1`  
   Full `count` array: `[0,2,1,2,2,0,0,1]`
4. Overwrite the original array with sorted values:
   - Put two 1s: `[1,1,...]`
   - Then one 2: `[1,1,2,...]`
   - Then two 3s: `[1,1,2,3,3,...]`
   - Then two 4s: `[1,1,2,3,3,4,4,...]`
   - Then one 7: `[1,1,2,3,3,4,4,7]`

**Result:**
`[1, 1, 2, 3, 3, 4, 4, 7]`

---

## How to Use

1. **Clone or copy the Sorting.java file into your Java project.**
2. The `main` method demonstrates usage; feel free to change test arrays and uncomment the sort you want to try.
3. Each sort prints out:
   - The sorted array
   - For bubble sort, the number of swaps performed (a measure of efficiency).

### Sample in `main`:

```java
// To use Bubble Sort:
int arr[] = { 5, 4, 1, 3, 2 };
bubbleSort(arr);

// To use Counting Sort:
int arr1[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
CountingSort(arr1);
```

---

## Summary Table

| Algorithm      | Time Complexity | Space Complexity | Stable | Use Case                                 |
|----------------|----------------|------------------|--------|-------------------------------------------|
| Bubble Sort    | O(n²)          | O(1)             | Yes    | Small datasets, easy to program           |
| Selection Sort | O(n²)          | O(1)             | No     | When swapping is costly                   |
| Insertion Sort | O(n²), O(n) best| O(1)            | Yes    | Almost sorted arrays, small datasets      |
| Counting Sort  | O(n + k)       | O(k)             | Yes    | Integers with small (max-min) range       |

---

## Learning Tips

- Try dry running each algorithm on paper with a 5-element array.
- Understand why some sorts are stable (preserve equal element order).
- Modify the code to sort in descending order and observe the changes.
- Compare swap counts or operation counts to see their practical differences.

## References

- [Bubble Sort - Wikipedia](https://en.wikipedia.org/wiki/Bubble_sort)
- [Selection Sort - Wikipedia](https://en.wikipedia.org/wiki/Selection_sort)
- [Insertion Sort - Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)
- [Counting Sort - Wikipedia](https://en.wikipedia.org/wiki/Counting_sort)

---

**Happy Learning — Sorting is fundamental, and understanding these basics will empower your coding journey!**