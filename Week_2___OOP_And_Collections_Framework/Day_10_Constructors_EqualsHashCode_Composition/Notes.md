# 📘 Day 10 — Constructors, equals/hashCode & Composition

---

## 🔹 Constructors

A constructor is a special method used to initialize objects. It is automatically called when an object is created.

### 🔸 Rules
- Constructor name must be same as class name
- No return type (not even void)
- Called automatically using `new`

### 🔸 Types of Constructors

#### 1. Default Constructor
- Provided by compiler if no constructor is written

#### 2. No-Argument Constructor
- User-defined constructor with no parameters

#### 3. Parameterized Constructor
- Accepts values during object creation

#### 4. Constructor Overloading
- Multiple constructors with different parameter lists

#### 5. Constructor Chaining
- `this()` → calls another constructor in same class
- `super()` → calls parent constructor

---

## 🔹 equals() and hashCode()

These methods are inherited from Object class.

### 🔸 equals()
Used to compare object content logically.

### 🔸 hashCode()
Returns integer hash value used in hashing collections.

---

## 🔸 Contract Between equals() and hashCode()

- If two objects are equal using equals(), they must have same hashCode()
- If hashCode is same, objects may or may not be equal
- If equals() is overridden, hashCode() should also be overridden

---

## 🔸 Why Override Both?

- Required for correct behavior in HashMap, HashSet, Hashtable
- Prevent duplicate logical objects
- Improves lookup performance

---

## 🔹 Composition vs Inheritance

### 🔸 Inheritance

Represents **is-a** relationship.

Example:
- Car is a Vehicle

### 🔸 Composition

Represents **has-a** relationship.

Example:
- Car has an Engine

---

## 🔸 Why Favor Composition?

- Loose coupling
- Better flexibility
- Easier maintenance
- Reuse behavior without deep hierarchy

---

## 🔹 Key Points

- Constructors initialize objects
- equals compares content
- hashCode supports hashing collections
- Composition is often preferred over inheritance