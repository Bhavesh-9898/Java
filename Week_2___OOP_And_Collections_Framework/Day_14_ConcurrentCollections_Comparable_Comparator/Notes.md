# 📘 Day 14 — Concurrent Collections, Comparable/Comparator + Week 2 Revision

---

## 🔹 Thread-Safe Collections

Thread-safe collections are designed to work safely in multi-threaded environments.

---

## 🔸 Collections.synchronizedList()

- Wraps a normal list with synchronized methods
- Only one thread can access at a time
- Manual synchronization needed during iteration

---

## 🔸 ConcurrentHashMap

- Thread-safe map designed for high concurrency
- Better performance than Hashtable
- Allows multiple threads to read/write efficiently

---

## 🔸 CopyOnWriteArrayList

- Creates a new copy of array on every write operation
- Safe iteration without ConcurrentModificationException
- Best for read-heavy workloads

---

## 🔹 Fail-Fast vs Fail-Safe

---

## 🔸 Fail-Fast Iterator

- Detects structural modification during iteration
- Throws ConcurrentModificationException
- Example: ArrayList, HashMap

---

## 🔸 Fail-Safe Iterator

- Works on snapshot/copy of collection
- No exception during concurrent modification
- Example: CopyOnWriteArrayList, ConcurrentHashMap iterator

---

## 🔹 Comparable

Used for natural/default ordering of objects.

### Method:
- compareTo()

### Example:
Sort Person by age

---

## 🔹 Comparator

Used for custom ordering logic.

### Method:
- compare()

### Example:
Sort Person by name

---

## 🔸 Comparable vs Comparator

| Feature | Comparable | Comparator |
|--------|------------|-----------|
| Package | java.lang | java.util |
| Method | compareTo() | compare() |
| Sorting Type | Natural | Custom |
| Changes Class | Yes | No |

---

## 🔹 Lambda Usage

Comparator can be written using lambda for cleaner code.

---

## 🔹 Revision Tip

Review Week 2:
- OOP Pillars
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Collections Hierarchy
- List, Set, Map, Queue
