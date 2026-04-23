# 📘 Day 17 — Thread Pools, Concurrency Utilities & Deadlock

---

## 🔹 ExecutorService

ExecutorService manages a pool of worker threads and simplifies task execution.

### 🔸 Why Use It?

- Reuse threads
- Better performance
- Task scheduling
- Easier shutdown/control

---

## 🔸 Common Thread Pools

### newFixedThreadPool(n)
- Fixed number of threads

### newCachedThreadPool()
- Creates threads as needed
- Reuses idle threads

### newSingleThreadExecutor()
- Single worker thread
- Executes tasks sequentially

---

## 🔸 shutdown()

- Stops accepting new tasks
- Finishes submitted tasks

---

## 🔹 Concurrency Utilities

Utilities from `java.util.concurrent` for advanced thread coordination.

---

## 🔸 ReentrantLock

- Explicit lock with more control than synchronized
- Supports tryLock, fairness, manual unlock

---

## 🔸 CountDownLatch

- Waits until counter reaches zero
- One-time use synchronization aid

---

## 🔸 CyclicBarrier

- Threads wait for each other at barrier point
- Reusable barrier

---

## 🔸 Semaphore

- Controls limited number of permits/resources

---

## 🔸 BlockingQueue

- Thread-safe queue
- Blocks producer/consumer when needed

---

## 🔸 AtomicInteger

- Lock-free atomic operations
- Useful for counters

---

## 🔹 Deadlock

Deadlock occurs when two or more threads wait forever for each other’s resources.

---

## 🔸 4 Coffman Conditions

1. Mutual Exclusion  
2. Hold and Wait  
3. No Preemption  
4. Circular Wait  

All four must exist for deadlock.

---

## 🔸 Prevention Strategies

- Lock ordering
- Timeout locks
- Avoid nested locks
- Reduce shared resources

---

## 🔸 Detection

- Thread dumps
- Monitoring tools
- JVM diagnostics

---

## 🔹 Key Points

- ExecutorService is preferred over manual thread creation  
- Utilities simplify synchronization  
- Deadlock can freeze application  
