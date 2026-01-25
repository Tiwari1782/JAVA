# Java Operators and Conditional Statements (If–Else, Ternary, Switch)

This README covers basic **decision-making and operators in Java** with small programs:

1. `if` / `else`  
2. `else if` ladder  
3. Ternary operator  
4. `switch` statement  

Examples included:

- Print the largest of 2 numbers  
- Check odd or even  
- Income tax calculator (simple)  
- Print largest of 3 numbers  
- Check if a student will pass or fail  
- Simple calculator using `switch`

---

## 1. `if` and `else`

### Structure

```java
if (condition) {
    // runs if condition is true
} else {
    // runs if condition is false
}
```

### 1.1 Print the largest of 2 numbers

```java
public class LargestOfTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("Largest: " + a);
        } else if (b > a) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Both are equal");
        }
    }
}
```

### 1.2 Print Odd or Even

A number is:
- **Even** if `num % 2 == 0`
- **Odd** otherwise

```java
public class OddEven {
    public static void main(String[] args) {
        int num = 7;

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
```

---

## 2. `else if` Ladder

Use `else if` when you have **multiple conditions**.

### 2.1 Simple Income Tax Calculator (Example)

Assume:

- Income ≤ 2.5L : 0% tax  
- 2.5L – 5L     : 5% tax  
- 5L – 10L      : 20% tax  
- > 10L         : 30% tax  

```java
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        double income = 750000; // 7.5 Lakh
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 0.05 * 250000              // 2.5L–5L
                + 0.20 * (income - 500000);  // 5L–income
        } else {
            tax = 0.05 * 250000              // 2.5L–5L
                + 0.20 * 500000              // 5L–10L
                + 0.30 * (income - 1000000); // above 10L
        }

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}
```

### 2.2 Print Largest of 3 Numbers

```java
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
        int c = 25;

        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }
}
```

---

## 3. Ternary Operator

**Syntax:**

```java
result = condition ? valueIfTrue : valueIfFalse;
```

### 3.1 Check if a Student Will Pass or Fail

Assume:
- Pass if `marks >= 40`
- Fail otherwise

```java
public class PassFail {
    public static void main(String[] args) {
        int marks = 35;

        String result = (marks >= 40) ? "Pass" : "Fail";

        System.out.println("Marks: " + marks);
        System.out.println("Result: " + result);
    }
}
```

You can also combine with `if`:

```java
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

---

## 4. `switch` Statement

Use `switch` when you compare **one value** against many constant options.

### Syntax

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no case matches
}
```

### 4.1 Simple Calculator Using `switch`

Operations: +, -, *, /, %

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
```

---

## 5. Quick Practice Tasks

Try to code these yourself:

1. **Largest of 2 numbers** using **ternary** instead of `if-else`.  
2. **Odd-even** using **ternary**.  
3. **Grade calculator** using `else if`:
   - `marks >= 90` → A  
   - `marks >= 75` → B  
   - `marks >= 60` → C  
   - else → D  
4. **Day of week** using `switch`:
   - Input: number 1–7  
   - Output: Monday–Sunday  

