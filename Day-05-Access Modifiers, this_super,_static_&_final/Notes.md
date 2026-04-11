# 📘 Day 5 — Access Modifiers, this/super, static & final

---

## 🔹 Access Modifiers

Access modifiers control the visibility and accessibility of classes, variables, methods, and constructors.

### 🔸 Types of Access Modifiers

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|------------|--------------|----------|---------------|
| public   | ✅ | ✅ | ✅ | ✅ |
| protected| ✅ | ✅ | ✅ | ❌* |
| default  | ✅ | ✅ | ❌ | ❌ |
| private  | ✅ | ❌ | ❌ | ❌ |

\* protected is accessible in other package only through inheritance.

---

## 🔹 this Keyword

The `this` keyword refers to the current object of the class.

### 🔸 Uses of this
- Access current object variables
- Call current class methods
- Invoke current class constructor using `this()`
- Pass current object as argument

---

## 🔹 super Keyword

The `super` keyword refers to the immediate parent class object.

### 🔸 Uses of super
- Access parent class variables
- Call parent class methods
- Invoke parent constructor using `super()`

---

## 🔹 Constructor Chaining

- `this()` → calls another constructor in same class  
- `super()` → calls parent class constructor  
- Must be the first statement in constructor

---

## 🔹 static Keyword

The `static` keyword belongs to the class rather than objects.

### 🔸 static Variable
- Shared by all objects

### 🔸 static Method
- Can be called without object
- Can access only static members directly

### 🔸 static Block
- Executes once when class loads

### 🔸 static Nested Class
- Nested class declared static

### 🔸 Can static method be overridden?
- No. It is method hiding, not overriding.

---

## 🔹 final Keyword

The `final` keyword is used to restrict modification.

### 🔸 final Variable
- Value cannot be reassigned

### 🔸 final Method
- Cannot be overridden

### 🔸 final Class
- Cannot be inherited

---

## 🔹 Reference vs Value Immutability

- final primitive → value cannot change  
- final reference → reference cannot change, object data may still change  

---

## 🔹 Key Points

- Access modifiers define scope  
- this = current object  
- super = parent object  
- static = class level  
- final = restriction keyword  