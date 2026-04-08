# 📘 Control Flow Statements (Theory)

Control flow statements determine the **order in which instructions are executed** in a program. They allow **decision-making, repetition, and transfer of control**.

---

## 🔹 1. if-else Statement

The **if-else statement** is used to execute a block of code based on a condition.

- If the condition is **true**, the `if` block executes  
- If the condition is **false**, the `else` block executes  

### Types:
- Simple `if`
- `if-else`
- `if-else if-else` (multiple conditions)
- Nested `if`

### Key Points:
- Used for **decision making**
- Works with **boolean conditions**
- Best for **range-based or complex conditions**

---

## 🔹 2. switch Statement

The **switch statement** is used to select one block of code from multiple options.

- It evaluates an expression and matches it with `case` values  
- If matched → corresponding block executes  
- If no match → `default` block executes  

### Key Points:
- Works with **fixed values** (`int`, `char`, `String`, `enum`)
- `break` is used to stop execution after a case
- Without `break`, **fall-through occurs**

### Use Case:
- Menu-driven programs  
- Fixed choices  

---

## 🔹 3. Loops (Iteration Statements)

Loops are used to **execute a block of code repeatedly**.

---

### 🔸 for Loop

- Used when the number of iterations is **known**
- Contains initialization, condition, and update

#### Key Points:
- Best for **count-controlled loops**
- Compact and easy to manage

---

### 🔸 while Loop

- Executes while the condition is **true**
- Condition is checked **before execution**

#### Key Points:
- Used when iterations are **unknown**
- May execute **zero times**

---

### 🔸 do-while Loop

- Similar to `while` loop  
- Condition is checked **after execution**

#### Key Points:
- Executes **at least once**
- Useful when first execution is required

---

### 🔸 Enhanced for Loop (for-each)

- Used to iterate over **arrays and collections**

#### Key Points:
- Simplifies iteration
- No need for index
- Read-only traversal (cannot modify structure easily)

---

## 🔹 4. Jump Statements

Jump statements are used to **transfer control immediately** to another part of the program.

---

### 🔸 break

- Terminates the loop or switch statement immediately  
- Control moves to the next statement after the loop/switch  

#### Key Points:
- Used to **exit early**
- Common in loops and switch

---

### 🔸 continue

- Skips the current iteration of a loop  
- Moves to the next iteration  

#### Key Points:
- Does **not terminate the loop**
- Used to skip unwanted conditions

---

### 🔸 return

- Exits from the current method  
- Can return a value (if method has return type)

#### Key Points:
- Ends method execution immediately
- No code after return is executed

---

## 🎯 Summary

- **if-else** → decision making  
- **switch** → multiple fixed choices  
- **loops** → repetition  
- **break / continue / return** → control transfer  

---

## 🧠 Interview Insight

- `if-else` is flexible, `switch` is faster for fixed values  
- `while` may not execute, `do-while` executes at least once  
- `break` stops loop, `continue` skips iteration  
- `return` exits method completely  