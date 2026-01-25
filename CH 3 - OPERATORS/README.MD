# Java Operators

This README introduces **operators in Java** with simple explanations and examples. It’s a good starting point for beginners.

---

## 1. What is an Operator?

An **operator** is a symbol that tells the compiler to perform a specific operation on one, two, or three operands (values/variables) and return a result.

**Example:**

```java
int a = 10 + 5; // '+' is an operator, 10 and 5 are operands
```

---

## 2. Types of Operators in Java

1. Arithmetic Operators  
2. Unary Operators  
3. Relational (Comparison) Operators  
4. Logical Operators  
5. Bitwise Operators  
6. Assignment Operators  
7. Ternary (Conditional) Operator  
8. Misc/Other (instanceof, etc.)

---

## 3. Arithmetic Operators

Used for basic math operations.

| Operator | Description        | Example (`a = 10`, `b = 3`) | Result  |
|----------|--------------------|-----------------------------|---------|
| `+`      | Addition           | `a + b`                     | `13`    |
| `-`      | Subtraction        | `a - b`                     | `7`     |
| `*`      | Multiplication     | `a * b`                     | `30`    |
| `/`      | Division           | `a / b`                     | `3`     |
| `%`      | Modulus (remainder)| `a % b`                     | `1`     |

**Example:**

```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
```

---

## 4. Unary Operators

Operate on a single operand.

### 4.1 Increment and Decrement

- `++` : Increment (increase by 1)
- `--` : Decrement (decrease by 1)

Both can be **prefix** or **postfix**:

```java
int x = 5;
int y = ++x; // prefix: x becomes 6, then y = 6
int z = x--; // postfix: z = 6, then x becomes 5
```

### 4.2 Unary Plus and Minus

```java
int a = 10;
int b = -a;  // b = -10
int c = +b;  // c = -10 (unary + just returns the value)
```

### 4.3 Logical NOT (`!`)

Flips a boolean value.

```java
boolean isJavaFun = true;
System.out.println(!isJavaFun); // false
```

---

## 5. Relational (Comparison) Operators

Used to compare two values. Result is `true` or `false`.

| Operator | Meaning                  | Example (`a = 5`, `b = 10`) | Result    |
|----------|--------------------------|-----------------------------|-----------|
| `==`     | Equal to                 | `a == b`                    | `false`   |
| `!=`     | Not equal to             | `a != b`                    | `true`    |
| `>`      | Greater than             | `a > b`                     | `false`   |
| `<`      | Less than                | `a < b`                     | `true`    |
| `>=`     | Greater than or equal to | `a >= b`                    | `false`   |
| `<=`     | Less than or equal to    | `a <= b`                    | `true`    |

**Example:**

```java
public class RelationalExample {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
    }
}
```

---

## 6. Logical Operators

Used to combine multiple boolean expressions.

| Operator | Name       | Description                                           |
|----------|------------|-------------------------------------------------------|
| `&&`     | AND        | True if **both** conditions are true                 |
| `\|\|`   | OR         | True if **at least one** condition is true           |
| `!`      | NOT        | Inverts a boolean value                              |

**Example:**

```java
public class LogicalExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        // AND
        boolean canEnter = age >= 18 && hasID;
        System.out.println("Can enter: " + canEnter); // true

        // OR
        boolean discount = age < 18 || age > 60;
        System.out.println("Gets discount: " + discount); // false

        // NOT
        System.out.println("Not hasID: " + !hasID); // false
    }
}
```

---

## 7. Bitwise Operators

Work at the **bit** level (on integers and chars).

| Operator | Description      |
|----------|------------------|
| `&`      | Bitwise AND      |
| `\|`     | Bitwise OR       |
| `^`      | Bitwise XOR      |
| `~`      | Bitwise complement (NOT) |
| `<<`     | Left shift       |
| `>>`     | Right shift      |
| `>>>`    | Unsigned right shift |

**Example:**

```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        System.out.println(a & b);  // 1  (0001)
        System.out.println(a | b);  // 7  (0111)
        System.out.println(a ^ b);  // 6  (0110)
        System.out.println(~a);     // bitwise NOT of 5 (depends on 32‑bit representation)
        System.out.println(a << 1); // 10 (1010)
        System.out.println(a >> 1); // 2  (0010)
    }
}
```

---

## 8. Assignment Operators

Used to assign values to variables. Can be combined with arithmetic or bitwise operators.

| Operator | Example   | Equivalent to |
|----------|-----------|---------------|
| `=`      | `a = b`   | `a = b`       |
| `+=`     | `a += b`  | `a = a + b`   |
| `-=`     | `a -= b`  | `a = a - b`   |
| `*=`     | `a *= b`  | `a = a * b`   |
| `/=`     | `a /= b`  | `a = a / b`   |
| `%=`     | `a %= b`  | `a = a % b`   |
| `&=`     | `a &= b`  | `a = a & b`   |
| `\|=`    | `a \|= b` | `a = a \| b`  |
| `^=`     | `a ^= b`  | `a = a ^ b`   |
| `<<=`    | `a <<= 1` | `a = a << 1`  |
| `>>=`    | `a >>= 1` | `a = a >> 1`  |
| `>>>=`   | `a >>>= 1`| `a = a >>> 1` |

**Example:**

```java
public class AssignmentExample {
    public static void main(String[] args) {
        int a = 10;
        a += 5;  // a = 15
        a *= 2;  // a = 30
        a -= 4;  // a = 26

        System.out.println(a); // 26
    }
}
```

---

## 9. Ternary (Conditional) Operator

The only **three-operand** operator in Java.

```java
result = condition ? valueIfTrue : valueIfFalse;
```

**Example:**

```java
public class TernaryExample {
    public static void main(String[] args) {
        int age = 17;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status); // Minor
    }
}
```

---

## 10. `instanceof` Operator

Checks whether an object is an **instance** of a specific class or interface.

```java
public class InstanceofExample {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s instanceof String); // true
        System.out.println(s instanceof Object); // true
    }
}
```

---

## 11. Operator Precedence and Associativity

When multiple operators appear in one expression, **precedence** decides which is evaluated first.

From higher to lower (simplified):

1. Postfix: `expr++`, `expr--`
2. Prefix: `++expr`, `--expr`, `+`, `-`, `!`, `~`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Shift: `<<`, `>>`, `>>>`
6. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
7. Equality: `==`, `!=`
8. Bitwise AND: `&`
9. Bitwise XOR: `^`
10. Bitwise OR: `\|`
11. Logical AND: `&&`
12. Logical OR: `\|\|`
13. Ternary: `? :`
14. Assignment: `=`, `+=`, `-=`, ...

**Example:**

```java
int result = 10 + 5 * 2; // 5 * 2 evaluated first -> 10 + 10 = 20
```

Use parentheses to make expressions clearer:

```java
int result = (10 + 5) * 2; // 15 * 2 = 30
```

---

## 12. Quick Practice

Try predicting outputs:

```java
int a = 5;
int b = 2;
int c = a++ + ++b;  // ?

boolean x = true;
boolean y = false;
boolean z = x || (y && !x); // ?

int n = 8;
n >>= 1; // ?
```

Then run them in a small Java program to check your answers.

---

## 13. Summary

- **Arithmetic**: `+`, `-`, `*`, `/`, `%`
- **Unary**: `++`, `--`, `+`, `-`, `!`
- **Relational**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Logical**: `&&`, `\|\|`, `!`
- **Bitwise**: `&`, `\|`, `^`, `~`, `<<`, `>>`, `>>>`
- **Assignment**: `=`, `+=`, `-=`, ...
- **Ternary**: `? :`
- **Other**: `instanceof`

This file can be placed at the root of your project as `README.md` to help beginners understand operators in Java.