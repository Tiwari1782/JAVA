# Java Basics – Quick Notes

This file gives short, focused explanations and examples for core beginner Java topics.

---

## 1. Creating a Java File & Boilerplate Code

1. Create a file with **`.java`** extension, e.g. `Main.java`.
2. The file must contain a **class** and a **main method**.

```java
public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Hello, Java!");
    }
}
```

- File name and public class name should usually match (`Main.java` → `public class Main`).

---

## 2. Output in Java (`System.out.println`)

Used to print output on the screen:

```java
System.out.println("Hello");      // prints with newline
System.out.print("Hello ");       // prints without newline
System.out.println(10 + 20);      // prints 30
```

---

## 3. Variables in Java

A **variable** stores data in memory.

Syntax:  
`dataType variableName = value;`

```java
int age = 18;
double price = 99.99;
char grade = 'A';
boolean isPassed = true;
String name = "Ravi";
```

---

## 4. Data Types in Java

### Primitive Types
- `byte`, `short`, `int`, `long` → integers  
- `float`, `double` → decimal numbers  
- `char` → single character  
- `boolean` → `true` / `false`
## Size and Range of 8 Primitive Data Types in Java

| Data Type | Size (bytes) | Range                                                       |
|----------|--------------|-------------------------------------------------------------|
| byte     | 1            | -128 to 127                                                 |
| short    | 2            | -32,768 to 32,767                                           |
| int      | 4            | -2,147,483,648 to 2,147,483,647                             |
| long     | 8            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807     |
| float    | 4            | ~±3.4e38 (approx., 6–7 decimal digits)                      |
| double   | 8            | ~±1.7e308 (approx., 15 decimal digits)                      |
| char     | 2            | 0 to 65,535 (Unicode)                                       |
| boolean  | JVM-dependent| `true` or `false` (exact storage size not defined)          |

### Non-Primitive Types
- `String`, arrays, classes, object, interface.

Example:

```java
int count = 5;
double pi = 3.14;
char letter = 'J';
boolean isJavaFun = true;
String msg = "Java";
```

---

## 5. Literals in Java

A **literal** is a fixed value written directly in the code.

### Integer Literals

```java
int a = 10;       // decimal (base 10)
int b = 0b1010;   // binary (10)
int c = 012;      // octal  (10)
int d = 0xA;      // hex    (10)
```

You can use underscores for readability:

```java
int big = 1_000_000;
```

### Floating-Point Literals

```java
double x = 3.14;
float y = 2.5f;     // 'f' or 'F' for float
double z = 1.2e3;   // 1.2 × 10³ = 1200.0
```

### Character Literals

```java
char ch = 'A';
char digit = '5';
char newline = '\n';   // escape sequence
```

### String Literals

```java
String s = "Hello";
String line = "Java\nRocks";
```

### Boolean Literals

```java
boolean isValid = true;
boolean isDone = false;
```

---

## 6. Comments in Java

Used to explain code; ignored by the compiler.

```java
// Single-line comment

/*
 Multi-line
 comment
*/

/**
 * Documentation comment (for methods/classes)
 */
```

---

## 7. Input in Java (Using `Scanner`)

To take input from the user:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();          // integer input
        double d = sc.nextDouble();    // double input
        String s = sc.next();          // one word
        String line = sc.nextLine();   // whole line

        sc.close();
    }
}
```

---

## 8. Sum of `a` and `b` (Fixed Values)

```java
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
```

---

## 9. Sum of `a` and `b` (Input from User)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
```

---

## 10. Product of `a` and `b`

```java
public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int product = a * b;

        System.out.println("Product = " + product);
    }
}
```

(You can also take `a` and `b` from user using `Scanner`.)

---

## 11. Area of Circle

Formula: `area = π * r * r`

```java
public class Main {
    public static void main(String[] args) {
        double r = 5.0;
        double pi = 3.14159;
        double area = pi * r * r;

        System.out.println("Area = " + area);
    }
}
```

---

## 12. Print a Pattern (Simple Example)

Print:

```
*
**
***
```

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {      // rows
            for (int j = 1; j <= i; j++) {  // columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

---

## 13. Type Conversion (Widening)

**Automatic** conversion from smaller type to bigger type.

```java
int a = 10;
double d = a;   // int -> double (automatic)

System.out.println(d);  // 10.0
```
*Type conversion* :- 
byte -> short -> int -> float -> long -> double
---

## 14. Type Casting (Narrowing)

**Manual** conversion from bigger type to smaller type.

```java
double d = 9.7;
int x = (int) d;   // double -> int (fraction lost)

System.out.println(x);  // 9
```

---

## 15. Type Promotion in Expressions

In expressions, smaller types are promoted to a larger type:

```java
byte a = 10;
byte b = 20;
// a and b are promoted to int during expression
int result = a + b;

System.out.println(result); // 30
```

Also:

```java
int x = 5;
double y = 2.5;
double ans = x + y;  // x promoted to double

System.out.println(ans); // 7.5
```

---

## 16. How Does Java Code Run?

1. **Write code** in a `.java` file (source code).
2. **Compile** using `javac`:
   - `javac Main.java`  
   - Produces `Main.class` (bytecode).
3. **Run** using `java`:
   - `java Main`  
   - Java Virtual Machine (JVM) reads the bytecode and executes it.

Flow:  
**Source Code (.java) → Compiler → Bytecode (.class) → JVM → Native Code**

---