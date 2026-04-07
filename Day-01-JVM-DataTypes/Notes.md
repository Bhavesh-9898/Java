\# 📘 Day 1 — JVM Architecture \& Data Types



\## 🔹 What is JVM?

JVM (Java Virtual Machine) is an engine that provides a runtime environment to execute Java bytecode.



\### Components of JVM:

1\. \*\*ClassLoader\*\*

&#x20;  - Loads class files into memory



2\. \*\*Runtime Memory Areas\*\*

&#x20;  - Method Area

&#x20;  - Heap

&#x20;  - Stack

&#x20;  - PC Register

&#x20;  - Native Method Stack



3\. \*\*Execution Engine\*\*

&#x20;  - Interpreter

&#x20;  - JIT (Just-In-Time Compiler)

&#x20;  - Garbage Collector (GC)



\---



\## 🔹 JDK vs JRE vs JVM



| Component | Description |

|----------|------------|

| JVM | Executes Java bytecode |

| JRE | JVM + Libraries |

| JDK | JRE + Development Tools |



\---



\## 🔹 Data Types in Java



\### 1. Primitive Data Types (8 types)

\- byte

\- short

\- int

\- long

\- float

\- double

\- char

\- boolean



\### 2. Non-Primitive Data Types

\- String

\- Arrays

\- Classes

\- Interfaces



\---



\## 🔹 Default Values



| Data Type | Default Value |

|----------|--------------|

| int | 0 |

| float | 0.0 |

| double | 0.0 |

| char | '\\u0000' |

| boolean | false |

| reference | null |



\---



\## 🔹 Interview Questions



1\. What is the difference between JDK, JRE, and JVM?

2\. What are the memory areas in JVM?

3\. What is Garbage Collection?

4\. Where are local variables stored?

5\. What is the size of int and double?



\---



\## 🔹 Key Points

\- JVM is platform dependent, Java is platform independent

\- Bytecode runs inside JVM

\- Heap stores objects, Stack stores method calls

\- GC automatically manages memory

