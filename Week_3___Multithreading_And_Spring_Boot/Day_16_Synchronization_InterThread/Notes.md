# 📘 Day 16 — Synchronization & Inter-Thread Communication

---

## 🔹 Why Synchronization?

When multiple threads access shared data simultaneously, inconsistent results may occur.  
Synchronization ensures only one thread accesses critical section at a time.

---

## 🔹 synchronized Keyword

Used to provide mutual exclusion and thread safety.

---

## 🔸 Method-Level Synchronization

- Entire method is locked
- Thread acquires object lock before execution

---

## 🔸 Block-Level Synchronization

- Only selected code block is locked
- Better performance than method-level

---

## 🔸 Intrinsic Lock / Monitor

Every Java object has an internal lock (monitor).  
`synchronized` uses this lock.

---

## 🔸 Re-entrant Locking

A thread holding a lock can enter another synchronized method/block on same object.

---

## 🔹 volatile Keyword

Used to guarantee visibility of changes across threads.

### Key Points:
- Reads latest value from main memory
- Does NOT provide atomicity
- Good for flags/status variables

---

## 🔹 wait(), notify(), notifyAll()

Used for inter-thread communication.

### wait()
- Releases lock and waits

### notify()
- Wakes one waiting thread

### notifyAll()
- Wakes all waiting threads

### Important Rule:
Must be called inside synchronized context.

---

## 🔹 Producer-Consumer Problem

- Producer adds data
- Consumer removes data
- Coordination done using wait/notify

---

## 🔹 Key Points

- synchronized prevents race conditions
- volatile = visibility only
- wait/notify used for coordination
- Use block sync for better performance