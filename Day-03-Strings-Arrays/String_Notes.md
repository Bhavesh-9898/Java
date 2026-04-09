## 🔹 String in Java (Theory)

A **String** is a sequence of characters used to represent text in Java. Strings are widely used for storing and manipulating textual data.

---

### 🔸 Immutability

- Strings in Java are **immutable**
- Once a String object is created, its value **cannot be changed**
- Any modification results in the creation of a **new String object**

---

### 🔸 String Pool

- String Pool is a special memory area inside the **heap**
- It stores **unique string literals**
- If the same string value is created again, Java reuses the existing object instead of creating a new one
- This improves **memory efficiency**

---

### 🔸 String Creation

Strings can be created in two ways:

- Using **string literal** → stored in String Pool  
- Using **new keyword** → stored in heap memory  

---

### 🔸 String Comparison

- `==` compares **memory references (addresses)**  
- `equals()` compares **actual content (values)**  

---

### 🔸 Common String Operations

- Finding length of string  
- Accessing characters  
- Extracting substrings  
- Comparing strings  
- Converting case (uppercase/lowercase)  

---

### 🔸 StringBuilder vs StringBuffer

| Feature | StringBuilder | StringBuffer |
|--------|-------------|-------------|
| Mutability | Mutable | Mutable |
| Thread Safety | Not thread-safe | Thread-safe |
| Performance | Faster | Slower |

---

### 🔸 When to Use

- Use **String** → when data does not change  
- Use **StringBuilder** → when frequent modifications are needed (single-threaded)  
- Use **StringBuffer** → when thread safety is required (multi-threaded)  

---

### 🔸 Key Points

- Strings are immutable  
- String Pool improves memory usage  
- `==` vs `equals()` is a common interview question  
- StringBuilder is preferred for performance  