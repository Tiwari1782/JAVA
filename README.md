# JAVA Learning Journey

Welcome to my **Java Learning Repository**.  
Here I will go through Java step‑by‑step: from absolute basics to advanced topics and Data Structures & Algorithms (DSA).

Each section has:
- A **heading**
- A **short, simple explanation** (no long theory)
- I can add code examples in separate files/directories as I learn

---

## 1. Introduction to Java

### 1.1 What is Java?
Java is a high-level, object‑oriented, platform‑independent programming language.  
“Write Once, Run Anywhere” using the Java Virtual Machine (JVM).

### 1.2 JDK, JRE, JVM
- **JDK (Java Development Kit)** – tools to write and compile Java programs.
- **JRE (Java Runtime Environment)** – environment to run Java programs.
- **JVM (Java Virtual Machine)** – runs compiled `.class` bytecode on any OS.

### 1.3 Installing Java & First Program
Install JDK, set `JAVA_HOME`, and update `PATH`.  
Write `HelloWorld.java`, compile with `javac`, run with `java`.

---

## 2. Java Basics & Syntax

### 2.1 Structure of a Java Program
A Java file has:
- Package (optional)
- `class` definition
- `main` method as entry point: `public static void main(String[] args)`

### 2.2 Data Types
- **Primitive**: `byte, short, int, long, float, double, char, boolean`
- **Non‑primitive**: `String, arrays, classes, interfaces`, etc.

### 2.3 Variables & Constants
Use variables to store values.  
Use `final` to make a constant (value cannot change once assigned).

### 2.4 Operators
- Arithmetic: `+ - * / %`
- Relational: `== != > < >= <=`
- Logical: `&& || !`
- Assignment: `= += -= *= /=`
- Unary: `++ --` (pre and post)

### 2.5 Input & Output
- Output: `System.out.print` / `println`
- Input: `Scanner` class (e.g., `new Scanner(System.in)`)

---

## 3. Control Flow Statements

### 3.1 If, If‑Else, Else‑If
Used for decision making based on conditions (true/false).

### 3.2 Switch Statement
Multi‑branch decision based on a value (like menu selection).

### 3.3 Loops: for, while, do‑while
- `for` – when the number of iterations is known.
- `while` – repeats while condition is true.
- `do‑while` – executes at least once, then checks condition.

### 3.4 Break and Continue
- `break` – exits the current loop or switch.
- `continue` – skips current iteration and goes to the next.

---

## 4. Arrays and Strings

### 4.1 One‑Dimensional Arrays
A fixed‑size collection of elements of the same type (e.g., `int[]`).

### 4.2 Multi‑Dimensional Arrays
Arrays of arrays (e.g., 2D matrix: `int[][]`).

### 4.3 Array Operations
Common tasks: traversal, searching, updating, basic algorithms (sum, max, min).

### 4.4 Strings in Java
`String` is an immutable sequence of characters stored as an object.

### 4.5 String Methods
Useful methods: `length()`, `charAt()`, `substring()`, `toUpperCase()`, `toLowerCase()`, `indexOf()`, `equals()`.

### 4.6 StringBuilder and StringBuffer
Mutable string classes; better for many string modifications.

---

## 5. Methods and Recursion

### 5.1 Defining and Calling Methods
Methods group logic.  
Have return type, name, parameters, and body.

### 5.2 Method Overloading
Multiple methods with the same name but different parameters.

### 5.3 Pass‑by‑Value
Java passes copies of variable values to methods (even for object references).

### 5.4 Recursion Basics
A method calling itself to solve a problem in smaller subproblems.

---

## 6. Object-Oriented Programming (OOP) Basics

### 6.1 Classes and Objects
- **Class** – blueprint/template.
- **Object** – actual instance of the class in memory.

### 6.2 Fields and Methods
- Fields (variables) hold data.
- Methods define behaviors of the object.

### 6.3 Constructors
Special methods to initialize objects.  
Name = class name, no return type.

### 6.4 `this` Keyword
Refers to the current object; used to avoid naming conflicts and call other constructors.

---

## 7. OOP Principles

### 7.1 Encapsulation
Hiding data using private fields and exposing via getters and setters.

### 7.2 Inheritance
One class acquires properties and methods of another class using `extends`.

### 7.3 Polymorphism
Same method name, different implementations:
- Overloading (compile time)
- Overriding (runtime)

### 7.4 Abstraction
Hiding complex details and showing only the necessary parts:
- Abstract classes
- Interfaces

---

## 8. Advanced OOP Concepts

### 8.1 Abstract Classes
Cannot be instantiated; can have abstract and non‑abstract methods.

### 8.2 Interfaces
Define contracts (methods) that implementing classes must provide.

### 8.3 Inner and Nested Classes
Classes inside other classes; used for logically grouping and helper classes.

### 8.4 Static Members
`static` fields and methods belong to the class, not individual objects.

---

## 9. Packages and Access Modifiers

### 9.1 Packages
Group related classes and interfaces; help organize code and avoid name conflicts.

### 9.2 `import` Statement
Used to access classes from other packages easily.

### 9.3 Access Modifiers
- `public`, `protected`, default (no keyword), `private`
Control where classes and members can be accessed.

---

## 10. Exception Handling

### 10.1 Errors vs Exceptions
- Errors usually serious issues (like OutOfMemory).
- Exceptions are problems that can be handled in code.

### 10.2 Try‑Catch Block
Wrap risky code in `try` and handle exceptions in `catch`.

### 10.3 Finally Block
Code in `finally` always runs (commonly for cleanup).

### 10.4 Throwing Exceptions
Use `throw` and `throws` to signal and propagate exceptions.

### 10.5 Custom Exceptions
Create your own exception classes for specific error cases.

---

## 11. Java Collections Framework

### 11.1 Collections Overview
Ready‑made data structures: lists, sets, maps, queues, etc.

### 11.2 List Interface
Ordered collection, allows duplicates:
- `ArrayList`, `LinkedList`, `Vector`

### 11.3 Set Interface
Unordered, no duplicates:
- `HashSet`, `LinkedHashSet`, `TreeSet`

### 11.4 Map Interface
Key‑value pairs:
- `HashMap`, `LinkedHashMap`, `TreeMap`

### 11.5 Queue and Deque
FIFO structures and double‑ended queues:
- `PriorityQueue`, `ArrayDeque`

### 11.6 Iterators
Objects to traverse collections (`Iterator`, `ListIterator`).

---

## 12. Generics

### 12.1 Why Generics?
Provide type safety at compile time and avoid unnecessary casts.

### 12.2 Generic Classes and Methods
Define classes/methods with type parameters like `<T>`.

### 12.3 Bounded Type Parameters
Restrict types with `extends` (upper bounds) and super (lower bounds in wildcards).

---

## 13. File Handling and I/O

### 13.1 Byte and Character Streams
Classes for reading/writing data as bytes or characters.

### 13.2 File Reading and Writing
Use classes like `FileInputStream`, `FileOutputStream`, `FileReader`, `FileWriter`, `BufferedReader`.

### 13.3 Serialization
Converting objects to byte streams to store or send over network (`Serializable` interface).

---

## 14. Multithreading and Concurrency

### 14.1 Threads in Java
Independent paths of execution for parallel tasks.

### 14.2 Creating Threads
By extending `Thread` or implementing `Runnable`.

### 14.3 Thread States and Lifecycle
New, Runnable, Running, Blocked/Waiting, Terminated.

### 14.4 Synchronization
Prevents race conditions when multiple threads access shared data.

### 14.5 Executors and Concurrency Utilities
Higher‑level APIs to manage thread pools and tasks (`ExecutorService`, `Future`, etc.).

---

## 15. Java 8+ Features (Core)

### 15.1 Lambda Expressions
Short syntax to define anonymous functions (functional style).

### 15.2 Functional Interfaces
Interfaces with a single abstract method (like `Runnable`, `Callable`).

### 15.3 Streams API
Functional operations on collections (filter, map, reduce).

### 15.4 Optional Class
Container that may or may not hold a non‑null value, helps avoid `null` checks.

---

## 16. Java and OOP Design Concepts

### 16.1 Immutability
Objects whose state cannot change after creation (`String` is immutable).

### 16.2 Object Class Methods
`toString()`, `equals()`, `hashCode()`, `clone()` etc.

### 16.3 Common Design Patterns (Overview)
Singleton, Factory, Builder, Strategy, Observer, etc.

---

## 17. Data Structures (DSA) in Java

### 17.1 Complexity Analysis
Understanding time and space complexity using Big‑O notation.

### 17.2 Arrays and Dynamic Arrays
Static arrays and dynamic arrays using `ArrayList`.

### 17.3 Linked Lists
Singly and doubly linked lists; nodes connected via references.

### 17.4 Stacks
LIFO (Last‑In, First‑Out) structure; can use `Stack` or `Deque`.

### 17.5 Queues
FIFO (First‑In, First‑Out) structure; can use `Queue` implementations.

### 17.6 Priority Queues / Heaps
Elements accessed by priority; often implemented with binary heap.

### 17.7 Hashing and Hash Tables
Fast lookups using hash functions; implemented with `HashMap` / `HashSet`.

### 17.8 Trees
Hierarchical data structure with root and child nodes.

### 17.9 Binary Trees and BST
Binary Tree: each node has at most two children.  
BST: left < root < right, useful for search.

### 17.10 Balanced Trees (Concept)
Trees that maintain height balance for faster operations (e.g., AVL, Red‑Black).

### 17.11 Tries (Prefix Trees)
Tree structure used for storing strings by characters, useful for prefix queries.

### 17.12 Graphs
Nodes (vertices) and connections (edges); can be directed/undirected, weighted/unweighted.

---

## 18. Algorithms (DSA) in Java

### 18.1 Searching Algorithms
- Linear Search – scan each element.
- Binary Search – efficient search on sorted arrays.

### 18.2 Sorting Algorithms (Basic)
- Bubble, Selection, Insertion sort (easy to understand, less efficient).

### 18.3 Efficient Sorting
- Merge Sort, Quick Sort, Heap Sort (better complexity for large data).

### 18.4 Recursion in DSA
Used in many problems (tree/graph traversals, divide and conquer).

### 18.5 Divide and Conquer
Break problem into subproblems, solve and combine results (e.g., merge sort).

### 18.6 Greedy Algorithms
Build solution step by step choosing locally best option (e.g., activity selection).

### 18.7 Dynamic Programming (DP)
Optimize recursive solutions by storing intermediate results.

### 18.8 Backtracking
Try all possibilities and backtrack when a choice fails (e.g., N‑Queens).

### 18.9 Graph Traversals
- DFS (Depth First Search)
- BFS (Breadth First Search)

### 18.10 Shortest Path Algorithms
- Dijkstra’s algorithm
- Bellman‑Ford (concept level)

### 18.11 Minimum Spanning Tree (MST)
Connect all vertices with minimum total edge weight (Kruskal / Prim).

---

## 19. Practice and Projects

### 19.1 Coding Practice
Solve problems from basic to advanced on platforms like:
arrays, strings, recursion, DP, graphs, etc.

### 19.2 Mini Projects
Small Java projects to apply knowledge:
- Console apps (calculator, todo list)
- Simple games
- File utilities

### 19.3 Interview‑Style Problems
Focus on patterns like:
- Sliding window
- Two pointers
- Fast and slow pointers
- Binary search on answer
- DP patterns (knapsack, LIS, etc.)

---

## 20. How This Repository is Organized

### 20.1 Folder Structure (Planned)
- `basics/` – syntax, control flow, arrays, strings  
- `oop/` – classes, objects, inheritance, polymorphism  
- `advanced/` – collections, generics, multithreading, streams  
- `dsa/` – data structures and algorithms implementations  
- `projects/` – small practice projects  

---

## 21. Next Steps

1. Start from **Section 2 (Basics & Syntax)** and create example programs.
2. Gradually move through OOP, Collections, and Advanced topics.
3. Practice DSA problems regularly alongside learning.
4. Keep improving this README and code structure as my understanding grows.
