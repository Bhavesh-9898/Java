# 📘 Day 11 — Design Patterns

---

## 🔹 What are Design Patterns?

Design patterns are reusable solutions to common software design problems.  
They are best practices, not ready-made code.

### Benefits:
- Reusable design solutions
- Better maintainability
- Improved scalability
- Cleaner architecture
- Easier communication among developers

---

# 🔹 1. Singleton Pattern

Ensures that only **one object** of a class is created and provides global access to it.

### Common Types:
- Eager Initialization
- Lazy Initialization
- Double-Checked Locking
- Bill Pugh Singleton
- Enum Singleton

### Use Cases:
- Logger
- Configuration Manager
- Database Connection Pool

---

# 🔹 2. Factory Method Pattern

Creates objects without exposing exact creation logic to the client.

### Structure:
- Product
- ConcreteProduct
- Creator
- ConcreteCreator

### Benefits:
- Loose coupling
- Easy to extend
- Centralized object creation

---

# 🔹 3. Builder Pattern

Used to create complex objects step by step.

### Why Needed?
Avoids telescoping constructors (too many constructor parameters).

### Benefits:
- Readable object creation
- Method chaining
- Flexible optional parameters

---

# 🔹 4. Observer Pattern

Defines one-to-many dependency between objects.

When subject state changes, all observers are notified automatically.

### Use Cases:
- Event systems
- Notifications
- Stock price updates
- GUI listeners

---

## 🔹 Key Points

- Singleton → one instance
- Factory → object creation
- Builder → step-by-step construction
- Observer → publish/subscribe updates