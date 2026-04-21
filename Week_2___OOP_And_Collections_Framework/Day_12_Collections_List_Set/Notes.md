# 📘 Day 12 — Collections: List & Set

---

## 🔹 Collection Framework

The Java Collections Framework provides ready-made data structures and algorithms to store and manipulate groups of objects.

---

## 🔸 Collection Hierarchy

- Iterable  
  └── Collection  
      ├── List  
      ├── Set  
      └── Queue  

- Map is separate from Collection hierarchy.

---

## 🔹 List

List stores ordered elements and allows duplicates.

### Common Implementations

#### ArrayList
- Uses dynamic array internally
- Fast random access using index
- Slower insertion/removal in middle

#### LinkedList
- Uses doubly linked list internally
- Fast insertion/removal at known position
- Slower random access

---

## 🔸 ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|--------|-----------|------------|
| Internal Structure | Dynamic Array | Doubly Linked List |
| get(index) | Fast | Slow |
| Add at End | Fast | Fast |
| Insert/Delete Middle | Slow | Faster |
| Memory Usage | Less | More |

---

## 🔹 Set

Set stores unique elements and does not allow duplicates.

---

## 🔸 HashSet

- Uses hashing
- No insertion order guaranteed
- Allows one null element
- Fast average operations

---

## 🔸 LinkedHashSet

- Maintains insertion order
- Allows one null element
- Slightly slower than HashSet

---

## 🔸 TreeSet

- Stores sorted elements
- Uses Red-Black Tree
- Does not allow null (modern Java)
- Slower than HashSet but ordered

---

## 🔸 HashSet vs LinkedHashSet vs TreeSet

| Feature | HashSet | LinkedHashSet | TreeSet |
|--------|---------|---------------|--------|
| Ordering | No | Insertion Order | Sorted |
| Duplicates | ❌ | ❌ | ❌ |
| Null | One | One | ❌ |
| Performance | Fastest | Fast | Slower |

---

## 🔹 Key Points

- List = ordered + duplicates allowed  
- Set = unique elements  
- ArrayList good for reads  
- LinkedList good for frequent insert/delete  
- TreeSet gives sorted data  