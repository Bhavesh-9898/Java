# 📘 Day 2 — Variables, Operators & Control Flow

## 🔹 Variables in Java

### Types of Variables

1. **Local Variable**
   - Declared inside method
   - Stored in **Stack**
   - No default value

2. **Instance Variable**
   - Declared inside class, outside method
   - Stored in **Heap**
   - Default values assigned

3. **Static Variable**
   - Declared using `static`
   - Shared across all objects

4. **Final Variable**
   - Cannot be changed once assigned

---

## 🔹 Memory (Stack vs Heap)

| Memory | Stores |
|--------|------|
| Stack | Method calls, local variables |
| Heap | Objects, instance variables |

---

## 🔹 Operators in Java

### 1. Arithmetic Operators
`+ - * / %`

### 2. Relational Operators
`== != > < >= <=`

### 3. Logical Operators
`&& || !`

### 4. Bitwise Operators
`& | ^ ~ << >>`

### 5. Ternary Operator
```java
condition ? value1 : value2;