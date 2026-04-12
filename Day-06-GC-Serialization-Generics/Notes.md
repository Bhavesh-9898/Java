# 📘 Day 6 — Garbage Collection, Serialization & Generics

---

## 🔹 Garbage Collection

Garbage Collection (GC) is the automatic memory management process in Java that removes unused objects from heap memory.

### 🔸 Key Concepts

- Java automatically frees memory of unreachable objects
- Reduces memory leaks and manual memory handling
- Runs in background using JVM garbage collector

### 🔸 Heap Generations

- Young Generation → newly created objects
- Old Generation → long-lived objects
- Permanent/Metaspace → class metadata (modern JVM uses Metaspace)

### 🔸 Common Algorithms

- Mark-Sweep
- Copying
- Generational GC

### 🔸 Modern Collectors

- G1 GC → balanced performance
- ZGC → low latency, scalable

### 🔸 System.gc()

- Requests garbage collection
- It is only a hint, not guaranteed

---

## 🔹 Serialization

Serialization is the process of converting an object into a byte stream so it can be stored or transferred.

### 🔸 Why Used?

- Save object state to file
- Send object over network
- Cache objects

### 🔸 Serializable Interface

- Marker interface (no methods)
- Enables serialization

### 🔸 transient Keyword

- Prevents field from being serialized
- Used for passwords or temporary data

### 🔸 Deserialization

- Converting byte stream back into object

### 🔸 Streams Used

- ObjectOutputStream → write object
- ObjectInputStream → read object

---

## 🔹 Generics

Generics allow classes, interfaces, and methods to work with different data types safely.

### 🔸 Benefits

- Type safety
- Reusable code
- No explicit type casting

### 🔸 Type Erasure

- Generic type information is removed at runtime
- Generics exist mainly at compile-time

### 🔸 Wildcards

- ? → unknown type
- ? extends T → upper bounded
- ? super T → lower bounded

### 🔸 PECS Principle

- Producer Extends
- Consumer Super

Meaning:
- Use extends when reading data
- Use super when writing data

---

## 🔹 Key Points

- GC manages heap memory automatically
- Serialization stores object state
- transient fields are skipped
- Generics improve reusability and safety