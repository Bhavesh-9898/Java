# 📘 Day 9 — Polymorphism & Abstraction

---

## 🔹 Polymorphism

Polymorphism means **one name, many forms**.  
The same method or object can behave differently in different situations.

---

## 🔸 Types of Polymorphism

### 1. Compile-time Polymorphism

Also called **Method Overloading**.

- Same method name
- Different parameter list (number, type, or order)
- Decided at compile time

### Benefits:
- Improves readability
- Reuse same method name for related tasks

---

### 2. Runtime Polymorphism

Also called **Method Overriding**.

- Child class provides specific implementation of parent method
- Method call resolved at runtime
- Achieved using inheritance

### Dynamic Method Dispatch

A parent reference can hold child object, and overridden method is decided at runtime.

---

### Rules for Overriding

- Method name must be same
- Parameters must be same
- Return type same or covariant
- Access level cannot be more restrictive
- static methods are hidden, not overridden
- final methods cannot be overridden

---

## 🔹 Abstraction

Abstraction means **showing essential details and hiding implementation details**.

It focuses on **what an object does**, not how it does it.

---

## 🔸 Abstract Class

- Declared using `abstract`
- Can have abstract and non-abstract methods
- Can have constructors and instance variables
- Used when classes share common state/behavior

---

## 🔸 Interface

- Used to define contract
- Methods are public abstract by default (traditional)
- Supports multiple inheritance of type
- Java 8+ allows default and static methods

---

## 🔸 Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|--------|----------------|----------|
| Multiple Inheritance | ❌ No | ✅ Yes |
| Constructor | ✅ Yes | ❌ No |
| Instance Variables | ✅ Yes | Constants only |
| Methods | Abstract + Concrete | Abstract + Default + Static |

---

## 🔸 When to Use

- Use Abstract Class → common base behavior/state
- Use Interface → capability/contract shared by unrelated classes

---

## 🔹 Key Points

- Overloading = compile-time polymorphism  
- Overriding = runtime polymorphism  
- Abstraction hides implementation details  
- Interfaces support multiple inheritance of type  