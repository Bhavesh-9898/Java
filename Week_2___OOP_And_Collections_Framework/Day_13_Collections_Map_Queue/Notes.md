# 📘 Day 13 — Collections: Map & Queue

---

## 🔹 Map Interface

Map stores data in **key-value pairs**.  
Keys are unique, values can be duplicated.

> Map is part of Collections Framework but separate from Collection hierarchy.

---

## 🔸 HashMap

HashMap uses hashing for fast storage and retrieval.

### Internal Structure
- Array of buckets
- Each bucket stores entries using LinkedList
- In Java 8+, large buckets may convert to Red-Black Tree

### Features
- Average time complexity: O(1)
- Allows one null key
- Allows multiple null values
- No ordering guaranteed
- Not thread-safe

---

## 🔸 LinkedHashMap

LinkedHashMap extends HashMap and maintains insertion order.

### Features
- Preserves insertion order
- Slightly slower than HashMap
- Allows one null key

---

## 🔸 TreeMap

TreeMap stores entries in sorted order of keys.

### Features
- Uses Red-Black Tree
- Time complexity: O(log n)
- Sorted by natural order or comparator
- Does not allow null key

---

## 🔸 LinkedHashMap vs TreeMap

| Feature | LinkedHashMap | TreeMap |
|--------|---------------|--------|
| Order | Insertion Order | Sorted Order |
| Null Key | One Allowed | ❌ Not Allowed |
| Performance | Faster | Slower |

---

## 🔸 HashMap vs Hashtable

| Feature | HashMap | Hashtable |
|--------|---------|-----------|
| Thread-safe | ❌ No | ✅ Yes |
| Null Key | One Allowed | ❌ No |
| Null Values | Allowed | ❌ No |
| Performance | Faster | Slower |
| Status | Modern | Legacy |

---

## 🔹 Queue Interface

Queue follows **FIFO (First In, First Out)** principle.

### Common Methods
- add / offer
- remove / poll
- element / peek

---

## 🔸 PriorityQueue

- Elements processed by priority
- Natural ordering by default
- Works as min-heap by default

---

## 🔸 Deque

Deque means Double Ended Queue.

- Insert/remove from both ends

### Common Implementation
- ArrayDeque

---

## 🔹 Key Points

- Map stores key-value pairs  
- HashMap is fastest general-purpose map  
- TreeMap gives sorted keys  
- Queue follows FIFO  
- PriorityQueue is useful for heaps  