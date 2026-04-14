# 📘 Day 7 — Java 8 Features + Week 1 Revision

---

## 🔹 Lambda Expressions

Lambda expressions provide a concise way to implement functional interfaces using anonymous functions.

### 🔸 Benefits
- Less boilerplate code
- Improves readability
- Used heavily with Streams API

### 🔸 Key Idea
Represents behavior as data

---

## 🔹 Functional Interfaces

A functional interface contains exactly one abstract method.

### 🔸 Common Functional Interfaces

- Predicate → tests condition, returns boolean
- Function → transforms input to output
- Consumer → accepts input, returns nothing
- Supplier → provides value, takes no input

### 🔸 @FunctionalInterface

- Annotation used to indicate functional interface
- Prevents accidental multiple abstract methods

---

## 🔹 Stream API

Stream API is used for processing collections in a declarative way.

### 🔸 Intermediate Operations

- filter
- map
- sorted
- distinct

These return a new stream.

### 🔸 Terminal Operations

- collect
- forEach
- reduce
- count

These produce final result.

### 🔸 Lazy Evaluation

Intermediate operations execute only when terminal operation is called.

---

## 🔹 Optional

Optional is a container object used to avoid null checks and NullPointerException.

### 🔸 Common Methods

- ofNullable()
- orElse()
- orElseThrow()
- ifPresent()

---

## 🔹 Default Methods

Interfaces can have methods with implementation using default keyword.

### 🔸 Why Introduced?

- Backward compatibility
- Add new methods to interfaces without breaking old classes

---

## 🔹 Date and Time API

Modern date/time classes introduced in Java 8.

### 🔸 Important Classes

- LocalDate → date only
- LocalTime → time only
- LocalDateTime → date + time
- Instant → timestamp
- Duration → time-based amount
- Period → date-based amount

---

## 🔹 Revision Tip

Revisit Days 1–6:
- JVM & Data Types
- Variables & Control Flow
- Strings & Arrays
- Wrapper & Exceptions
- Access Modifiers
- GC, Serialization, Generics