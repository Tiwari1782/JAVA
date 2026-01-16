# Flowcharts for Beginner Programming Problems

This document explains basic **flowchart components** and provides **step-by-step flowchart explanations** for common beginner programming problems:

- Sum of 2 numbers  
- Calculate Simple Interest  
- Maximum of 3 numbers  
- Check if a number is prime  
- Sum of first N natural numbers  

Wherever “diagram” is mentioned, imagine (or draw) the shapes as described.

---

## 1. Flowcharts

A **flowchart** is a diagram that represents an algorithm or process using different symbols connected with arrows that show the flow of control.

Flowcharts help you:

- Visualize the logic before writing code  
- Find mistakes early  
- Explain your solution to others

---

## 2. Flowchart Components (with diagram descriptions)

Below are the most common symbols used in flowcharts.

### 2.1 Start / End – Oval

- **Shape**: Oval (also called terminator)  
- **Usage**: Marks the **beginning** and **end** of a flowchart.

**Text inside**:  
- `Start` for beginning  
- `End` / `Stop` for end

**Diagram (text version)**:

- Start: `( Start )`  
- End: `( End )`

---

### 2.2 Input / Output – Parallelogram

- **Shape**: Parallelogram  
- **Usage**:
  - **Input**: Read values from the user (e.g., numbers, names)
  - **Output**: Display results (e.g., print sum, print answer)

**Text examples inside**:
- `Input A, B`  
- `Print Sum`

**Diagram (text version)**:

- Input: `⟪ Input A, B ⟫`  
- Output: `⟪ Print Sum ⟫`

---

### 2.3 Process – Rectangle

- **Shape**: Rectangle  
- **Usage**: Represents a **processing step** or **calculation**.

**Text examples inside**:
- `Sum = A + B`  
- `SI = (P * R * T) / 100`  
- `i = i + 1`

**Diagram (text version)**:

- Process: `[ Sum = A + B ]`

---

### 2.4 Decision – Diamond

- **Shape**: Diamond  
- **Usage**: Represents a **decision** or **condition** which has two or more possible outcomes, usually **Yes/No** or **True/False**.

**Text examples inside**:
- `Is N > 0?`  
- `Is A > B?`  
- `Is N divisible by i?`

**Diagram (text version)**:

- Decision: `◇ Is A > B? ◇`  
  - One arrow labeled `Yes`  
  - One arrow labeled `No`

---

## 3. Flowchart: Sum of 2 Numbers

**Problem**: Read two numbers and find their sum.

### Steps (Algorithm)

1. Start  
2. Input two numbers: `A` and `B`  
3. Calculate `Sum = A + B`  
4. Output `Sum`  
5. End

### Flowchart Explanation (shape by shape)

1. **Start**  
   - Oval with text `Start`.

2. **Input**  
   - Parallelogram with text: `Input A, B`

3. **Process**  
   - Rectangle with text: `Sum = A + B`

4. **Output**  
   - Parallelogram with text: `Print Sum`

5. **End**  
   - Oval with text `End`.

---

## 4. Flowchart: Calculate Simple Interest

**Problem**: Calculate Simple Interest using the formula:  
\[
\text{Simple Interest (SI)} = \frac{P \times R \times T}{100}
\]  
where:
- `P` = Principal  
- `R` = Rate of interest  
- `T` = Time

### Steps (Algorithm)

1. Start  
2. Input `P`, `R`, and `T`  
3. Calculate `SI = (P * R * T) / 100`  
4. Output `SI`  
5. End

### Flowchart Explanation

1. **Start**  
   - Oval: `Start`.

2. **Input**  
   - Parallelogram: `Input P, R, T`

3. **Process**  
   - Rectangle: `SI = (P * R * T) / 100`

4. **Output**  
   - Parallelogram: `Print SI`

5. **End**  
   - Oval: `End`.

---

## 5. Flowchart: Maximum of 3 Numbers

**Problem**: Read three numbers `A`, `B`, `C` and find the **largest**.

### Idea

Compare:
- First compare `A` with `B`  
- Then compare the larger of (`A`, `B`) with `C`

### Steps (Algorithm – one simple approach)

1. Start  
2. Input `A`, `B`, `C`  
3. If `A >= B` then  
   - `Largest = A`  
   else  
   - `Largest = B`  
4. If `C > Largest` then  
   - `Largest = C`  
5. Output `Largest`  
6. End

### Flowchart Explanation (Decision diamonds used)

1. **Start**  
   - Oval: `Start`.

2. **Input**  
   - Parallelogram: `Input A, B, C`

3. **Decision 1**  
   - Diamond: `Is A >= B?`  
   - **Yes** branch: Goes to process `Largest = A`  
   - **No** branch: Goes to process `Largest = B`

4. **Process after Decision 1**  
   - Rectangle: Either `Largest = A` or `Largest = B` (depending on the branch)  
   - Both branches rejoin before next decision.

5. **Decision 2**  
   - Diamond: `Is C > Largest?`  
   - **Yes**: Go to process `Largest = C`  
   - **No**: Skip to output

6. **(Optional) Process**  
   - Rectangle (if Yes): `Largest = C`

7. **Output**  
   - Parallelogram: `Print Largest`

8. **End**  
   - Oval: `End`.

---

## 6. Flowchart: Check if a Number is Prime or Not

**Problem**: Read a number `N` and check whether it is **prime** or not.

A **prime number** is a number greater than 1 that has **no positive divisors** other than 1 and itself.

### Simple Idea (Beginner-friendly, not optimized)

- If `N <= 1`, it is **not prime**.  
- Else, try dividing `N` by every number from `2` to `N - 1`.  
- If any number divides `N` exactly (remainder 0), then `N` is **not prime**.  
- If no number divides it, then `N` is **prime**.

### Steps (Algorithm)

1. Start  
2. Input `N`  
3. If `N <= 1` then  
   - Print “Not Prime”  
   - End  
4. Set `i = 2`  
5. Set `isPrime = true`  
6. While `i <= N - 1` do  
   - If `N % i == 0` then  
     - Set `isPrime = false`  
     - Break the loop  
   - `i = i + 1`  
7. After the loop:
   - If `isPrime == true` then  
     - Print “Prime”  
   - Else  
     - Print “Not Prime”  
8. End

*(In a basic flowchart, you often show the loop using a decision diamond back to the increment step.)*

### Flowchart Explanation (High Level)

1. **Start** – Oval: `Start`.

2. **Input** – Parallelogram: `Input N`.

3. **Decision 1** – Diamond: `Is N <= 1?`  
   - **Yes**:
     - Parallelogram: `Print "Not Prime"`  
     - Oval: `End`  
   - **No**:
     - Continue to initialization

4. **Initialization** – Process Rectangles:
   - `[ i = 2 ]`  
   - `[ isPrime = true ]`

5. **Decision 2 (Loop Condition)** – Diamond: `Is i <= N - 1?`  
   - **No**:
     - Exit loop and go to final decision about `isPrime`  
   - **Yes**:
     - Go to divisibility check

6. **Decision 3 (Divisibility)** – Diamond: `Is N % i == 0?`  
   - **Yes** (divisible):
     - Process: `[ isPrime = false ]`  
     - Arrow goes from here directly back to loop exit or to a diamond representing “continue checking?” (simplify by going to loop exit).  
   - **No**:
     - Process: `[ i = i + 1 ]`  
     - Arrow goes back to **Decision 2** (`Is i <= N - 1?`)

7. **Decision 4 (After Loop)** – Diamond: `Is isPrime == true?`  
   - **Yes**:
     - Parallelogram: `Print "Prime"`  
   - **No**:
     - Parallelogram: `Print "Not Prime"`

8. **End** – Oval: `End`.

---

## 7. Flowchart: Sum of First N Natural Numbers

**Problem**: Read a positive integer `N` and find the **sum of first N natural numbers**:  
\[
1 + 2 + 3 + \dots + N
\]

We will use the **loop method** (beginner-friendly), not the formula.

### Steps (Algorithm)

1. Start  
2. Input `N`  
3. Set `Sum = 0`  
4. Set `i = 1`  
5. While `i <= N` do  
   - `Sum = Sum + i`  
   - `i = i + 1`  
6. After loop ends, Output `Sum`  
7. End

### Flowchart Explanation

1. **Start** – Oval: `Start`.

2. **Input** – Parallelogram: `Input N`.

3. **Initialization Processes** – Rectangles:
   - `[ Sum = 0 ]`  
   - `[ i = 1 ]`

4. **Decision (Loop Condition)** – Diamond: `Is i <= N?`  
   - **No**:
     - Exit loop, go to output  
   - **Yes**:
     - Continue to processes

5. **Process 1** – Rectangle: `Sum = Sum + i`

6. **Process 2** – Rectangle: `i = i + 1`

7. Arrow from **Process 2** back to **Decision** `Is i <= N?` (this forms the loop).

8. **Output** – Parallelogram: `Print Sum`.

9. **End** – Oval: `End`.

---

## 8. Summary

- Use **Oval** for `Start` and `End`.  
- Use **Parallelogram** for all **inputs and outputs** (`Input`, `Print`).  
- Use **Rectangle** for **calculations and assignments** (e.g., `Sum = A + B`).  
- Use **Diamond** for **conditions and decisions** (e.g., `Is A > B?`, `Is i <= N?`).  

By practicing these flowcharts:
- Sum of 2 numbers  
- Simple Interest  
- Max of 3 numbers  
- Prime or not  
- Sum of first N natural numbers  

you will build a strong foundation in understanding **algorithms**, **logic**, and **basic programming**.