# Java Loops and Control Statements

This README covers loop basics in Java:

- `while` loop  
- `for` loop  
- `do-while` loop  
- `break` and `continue`  
- Basic loop problems:
  - Print 1 to 10  
  - Print 1 to `n`  
  - Sum of first `n` natural numbers  
  - Print square pattern  
  - Print reverse of a number  
  - Reverse of a given number  
  - Check if a number is prime or not  

---

## 1. Loop Basics

A **loop** is used to repeat a block of code multiple times.

Every loop generally has:

1. **Initialization** (start value)
2. **Condition** (when to stop)
3. **Update** (how to move to next value)

---

## 2. `while` Loop

### Syntax

```java
while (condition) {
    // code runs as long as condition is true
}
```

### 2.1 Print 1 to 10

```java
public class WhileOneToTen {
    public static void main(String[] args) {
        int i = 1; // initialization

        while (i <= 10) { // condition
            System.out.println(i);
            i++; // update
        }
    }
}
```

### 2.2 Print 1 to n

```java
public class WhileOneToN {
    public static void main(String[] args) {
        int n = 15; // you can change this or take from user
        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
```

### 2.3 Sum of First n Natural Numbers

```java
public class SumFirstN {
    public static void main(String[] args) {
        int n = 10; // sum of first 10 natural numbers
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i; // add current i to sum
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}
```

---

## 3. `for` Loop

### Syntax

```java
for (initialization; condition; update) {
    // code
}
```

Same as `while` but more compact.

### 3.1 Print 1 to 10 (for loop)

```java
public class ForOneToTen {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

### 3.2 Print Square Pattern

Example: For `n = 4`, print

```
****
****
****
****
```

```java
public class SquarePattern {
    public static void main(String[] args) {
        int n = 4; // size of square

        for (int i = 1; i <= n; i++) {        // rows
            for (int j = 1; j <= n; j++) {    // columns
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
```

---

## 4. Reverse of a Number

### 4.1 Print Reverse of a Number (e.g., 1234 → 4321)

Logic:

- Take last digit with `num % 10`
- Add that digit to reverse number
- Remove last digit with `num / 10`

```java
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;

        while (num > 0) {
            int lastDigit = num % 10; // get last digit
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // remove last digit
        }

        System.out.println("Reverse = " + reverse);
    }
}
```

This works for any **given** number as long as you put it in `num`, or read it from user input.

---

## 5. `do-while` Loop

`do-while` runs the loop **at least once**, even if the condition is false.

### Syntax

```java
do {
    // code
} while (condition);
```

### Example: Print 1 to 5

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

---

## 6. `break` Statement

- Used to **exit** a loop immediately.

### 6.1 Question: Demonstrate `break` keyword

**Problem:** Print numbers from 1 to 10, but stop when the number is 5.

```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit the loop
            }
            System.out.println(i);
        }
        System.out.println("Loop ended because i reached 5");
    }
}
```

Output:

```
1
2
3
4
Loop ended because i reached 5
```

---

## 7. `continue` Statement

- Used to **skip** the current iteration and go to the **next** one.

### 7.1 Question: Demonstrate `continue` keyword

**Problem:** Print numbers from 1 to 10, but skip 5.

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip printing 5
            }
            System.out.println(i);
        }
    }
}
```

Output:

```
1
2
3
4
6
7
8
9
10
```

---

## 8. Check if a Number is Prime or Not

A number `n` is **prime** if:
- `n > 1`
- It has **no divisors** other than 1 and `n` itself.

### Simple Method (check divisors from 2 to n-1)

```java
public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29; // change this value or take input from user
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            // check for factors
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // we found a factor, no need to continue
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
```

### Better Method (check only up to √n)

```java
public class PrimeCheckEfficient {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
```

---

## 9. Summary

- Use **`while`** when you don’t know exactly how many times the loop will run.
- Use **`for`** when you know the start, end, and step clearly.
- Use **`do-while`** when you want the body to execute **at least once**.
- Use **`break`** to **exit** from a loop early.
- Use **`continue`** to **skip** the current iteration and go to the next one.
- Loops are powerful for patterns, sums, reversing numbers, and checking for prime numbers.

If you want, I can add **Scanner** input versions for all problems so they read values from the user at runtime.