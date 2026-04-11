## 🔹 Exception Handling in Java (Detailed Theory)

Exception handling is a mechanism in Java used to handle **runtime errors**, allowing the program to continue execution instead of crashing.

---

### 🔸 What is an Exception?

An **exception** is an unwanted or unexpected event that occurs during program execution and disrupts the normal flow of the program.

---

### 🔸 Types of Exceptions

#### 1. Checked Exceptions
- Checked at **compile-time**
- Must be handled using try-catch or declared using `throws`
- Example: IOException, SQLException

---

#### 2. Unchecked Exceptions
- Occur at **runtime**
- Not mandatory to handle
- Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

---

### 🔸 Exception Hierarchy

- Throwable (Parent class)
  - Error (Serious issues, not handled)
  - Exception
    - Checked Exceptions
    - Unchecked Exceptions (RuntimeException)

---

### 🔸 try-catch Block

- Used to handle exceptions

#### Key Points:
- Code that may cause exception is written inside `try`
- `catch` block handles the exception
- Multiple catch blocks can be used

---

### 🔸 finally Block

- Always executes whether exception occurs or not
- Used for cleanup operations (closing files, releasing resources)

---

### 🔸 throw Keyword

- Used to **explicitly throw an exception**
- Can throw both checked and unchecked exceptions

---

### 🔸 throws Keyword

- Used in method signature
- Declares that a method may throw exceptions

---

### 🔸 Multiple Catch Blocks

- One try block can have multiple catch blocks
- Order matters: specific exceptions should come before general ones

---

### 🔸 Nested try-catch

- try-catch inside another try block
- Used for handling exceptions at different levels

---

### 🔸 Custom Exceptions

- User-defined exception classes
- Created by extending Exception class

#### Purpose:
- Handle application-specific errors
- Improve readability and maintainability

---

### 🔸 Important Concepts

#### 1. Stack Trace
- Shows sequence of method calls leading to exception

#### 2. Exception Propagation
- If not handled, exception moves up the call stack

#### 3. Checked vs Unchecked Difference

| Feature | Checked | Unchecked |
|--------|--------|----------|
| Checked at | Compile-time | Runtime |
| Handling | Mandatory | Optional |
| Example | IOException | NullPointerException |

---

### 🔸 Best Practices

- Use specific exceptions instead of generic ones  
- Avoid empty catch blocks  
- Use finally for resource cleanup  
- Do not use exceptions for normal flow  
- Create custom exceptions for business logic  

---

### 🔸 Key Points

- Exceptions prevent program crash  
- try-catch handles errors  
- finally always executes  
- throw vs throws is important for interviews  
- Custom exceptions improve clarity  