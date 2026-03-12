# UC1: Initialize Train and Display Consist Summary

## Goal
Initialize the **Train Consist Management App** and display the initial state of the train.

---

## Actor
User

---

## Flow

1. User runs the program.
2. Application prints a welcome message.
3. Train consist is initialized.
4. The initial bogie count is displayed.
5. Program continues execution.

---

## Key Concepts Used in UC1

### Class
A Java class acts as a container to hold program data and logic. The Train App logic lives inside a class.

### Main Method
Entry point of the Java application with the signature:

```java
public static void main(String[] args)
```

### Static Keyword
Allows the JVM to invoke `main()` without creating an object instance.

### ArrayList
A resizable list implementation from the Java Collections Framework used to store bogies dynamically. Unlike arrays, its size can grow at runtime.

### List Interface
Provides abstraction over different `List` implementations such as `ArrayList` and `LinkedList`.

### Console Output
Using `System.out.println()` to display application messages and consist summary.

### Dynamic Initialization
Creating an empty collection that will later be populated as bogies are added.

---

## Key Requirements

- Create a Java class for the Train App.
- Implement `main()` as the program entry point.
- Print a welcome message such as:

```
=== Train Consist Management App ===
```

- Initialize an empty `List` using `ArrayList`.
- Display the initial bogie count using `size()`.
---

## Key Benefits

- Introduces application startup flow.
- Teaches students where execution begins.
- Demonstrates why dynamic collections are needed instead of fixed arrays.
- Creates the foundation for all subsequent use cases.
