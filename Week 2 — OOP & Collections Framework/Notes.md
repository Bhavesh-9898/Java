# 📘 Encapsulation & Inheritance

---

## 🔹 Encapsulation

### 🔸 Concept

Encapsulation is the process of **binding data (attributes/fields) and the methods that operate on that data into a single unit (class)**, while protecting the data from outside interference and misuse.

It is also known as:

- Data Hiding  
- Information Hiding  

---

### 🔸 How It Is Achieved in Java

#### 1. Private Instance Variables
- Variables are declared as `private`
- Prevents direct access from outside the class

#### 2. Public Getter and Setter Methods
- **Getter methods** are used to read private data  
- **Setter methods** are used to modify private data  
- Validation logic can be added inside setters  

---

### 🔸 Benefits of Encapsulation

#### ✅ Data Security
- Protects data from unauthorized access

#### ✅ Flexibility / Maintainability
- Internal implementation can be changed without affecting external code

#### ✅ Modularity
- Makes classes self-contained and reusable

#### ✅ Control Over Data
- Allows business rules and validations while setting values

---

## 🔹 Inheritance

### 🔸 Concept

Inheritance is the mechanism by which one class acquires the **properties (fields)** and **behaviors (methods)** of another class.

It represents an **is-a relationship**.

Example:  
- A Car is-a Vehicle  
- A Dog is-an Animal  

---

### 🔸 Keywords Used

#### `extends`
- Used by a class to inherit from another class

#### `implements`
- Used by a class to implement an interface

---

### 🔸 Types of Inheritance

#### 1. Single Inheritance
- A class inherits from only one parent class  
- Java supports this for classes

#### 2. Multilevel Inheritance
- A class inherits from another class, which itself inherits from another class  
- Example: `A → B → C`

#### 3. Hierarchical Inheritance
- Multiple child classes inherit from one parent class

#### 4. Multiple Inheritance
- A class inherits from multiple parent classes

⚠️ Java does **not support multiple inheritance for classes** to avoid the **diamond problem** (ambiguity when parent classes contain same methods).

#### 5. Hybrid Inheritance
- Combination of two or more inheritance types

---

### 🔸 Benefits of Inheritance

#### ✅ Code Reusability
- Child classes reuse parent class code

#### ✅ Extensibility
- New features can be added by extending existing classes

#### ✅ Polymorphism
- Supports runtime polymorphism through method overriding

---