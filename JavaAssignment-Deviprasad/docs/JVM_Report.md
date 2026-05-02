# JVM Report - MediTrack Project

## 1. Introduction

The Java Virtual Machine (JVM) is an abstract machine that enables Java programs to run on any platform. It is responsible for loading, verifying, and executing Java bytecode.

---

## 2. Class Loader

The Class Loader loads `.class` files into memory.

### Types:

* Bootstrap ClassLoader → loads core Java classes
* Extension ClassLoader → loads extension libraries
* Application ClassLoader → loads user-defined classes

### Working:

1. Finds class file
2. Loads into memory
3. Verifies bytecode

---

## 3. Runtime Data Areas

### 3.1 Heap

* Stores objects
* Shared among threads
* Managed by Garbage Collector

### 3.2 Stack

* Stores method calls and local variables
* Each thread has its own stack

### 3.3 Method Area

* Stores class metadata, static variables, methods

### 3.4 PC Register

* Stores address of current instruction for each thread

---

## 4. Execution Engine

The Execution Engine executes bytecode using:

### Interpreter

* Executes code line-by-line
* Slower but starts quickly

### JIT Compiler (Just-In-Time)

* Converts bytecode into native machine code
* Improves performance

---

## 5. JIT Compiler vs Interpreter

| Feature   | Interpreter  | JIT Compiler |
| --------- | ------------ | ------------ |
| Speed     | Slow         | Fast         |
| Execution | Line-by-line | Compiled     |
| Startup   | Faster       | Slight delay |

---

## 6. Garbage Collection

* Automatically removes unused objects from heap
* Prevents memory leaks
* Improves memory management

---

## 7. Write Once, Run Anywhere (WORA)

Java follows WORA because:

* Code is compiled into bytecode
* JVM executes bytecode on any OS

Example:

* Same `.class` file runs on Windows, Linux, Mac

---

## 8. Conclusion

JVM plays a critical role in Java by:

* Managing memory
* Ensuring platform independence
* Optimizing execution using JIT

This makes Java robust, secure, and efficient.

---
