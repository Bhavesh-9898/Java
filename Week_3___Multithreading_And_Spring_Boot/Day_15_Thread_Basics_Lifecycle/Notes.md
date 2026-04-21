# 📘 Day 15 — Thread Basics & Lifecycle

---

## 🔹 What is a Thread?

A thread is the smallest unit of execution within a process.  
It allows multiple tasks to run concurrently inside a program.

---

## 🔹 Why Multithreading?

- Better performance
- Responsive applications
- Parallel task execution
- Efficient CPU utilization

---

## 🔹 Ways to Create Threads

---

## 🔸 1. Extending Thread Class

- Create a class that extends `Thread`
- Override `run()` method
- Start thread using `start()`

### Limitation:
- Cannot extend another class

---

## 🔸 2. Implementing Runnable Interface (Preferred)

- Create a class that implements `Runnable`
- Implement `run()` method
- Pass object to `Thread`

### Benefits:
- Supports inheritance from another class
- Better design and separation of task from thread

---

## 🔸 3. Callable + Future

- Used when thread returns result
- `Callable` has `call()` method
- `Future` stores result

### Benefits:
- Can return value
- Can throw checked exceptions

---

## 🔹 Thread Lifecycle

A thread moves through different states:

- NEW → thread created but not started
- RUNNABLE → ready/running
- BLOCKED → waiting for lock
- WAITING → waiting indefinitely
- TIMED_WAITING → waiting for specific time
- TERMINATED → execution finished

---

## 🔹 Important Methods

### start()
Starts a new thread and calls run() internally.

### run()
Contains task logic.

### sleep()
Pauses current thread for specified time.

### join()
Waits for another thread to finish.

### yield()
Hints scheduler to pause current thread.

---

## 🔹 Key Points

- `start()` creates new thread, `run()` alone does not
- Runnable is preferred in most cases
- Callable is used when result is needed
- Thread states are important for interviews