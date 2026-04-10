## 🔹 Wrapper Classes in Java (Detailed Theory)

Wrapper classes are used to convert **primitive data types into objects**.  
In Java, everything in collections and many APIs works with **objects**, so wrapper classes provide a way to use primitives as objects.

---

### 🔸 Primitive to Wrapper Mapping

Each primitive type has a corresponding wrapper class:

- byte → Byte  
- short → Short  
- int → Integer  
- long → Long  
- float → Float  
- double → Double  
- char → Character  
- boolean → Boolean  

---

### 🔸 Why Wrapper Classes are Needed

1. **Collections Framework**
   - Collections (ArrayList, HashMap, etc.) store only objects  
   - Wrapper classes allow storing primitive values  

2. **Utility Methods**
   - Provide useful methods for conversion and parsing  

3. **Object Representation**
   - Required when working with APIs that need objects  

---

### 🔸 Autoboxing

- Automatic conversion of **primitive → wrapper object**
- Done by Java internally (no manual conversion needed)

#### Key Idea:
Primitive value is automatically wrapped into an object

---

### 🔸 Unboxing

- Automatic conversion of **wrapper object → primitive**
- Java extracts primitive value from object

---

### 🔸 Important Utility Methods

Wrapper classes provide methods for data conversion:

- Converting String → primitive  
- Converting primitive → String  
- Comparing values  
- Finding max/min values  

---

### 🔸 Immutability

- Wrapper objects are **immutable**
- Once created, their value cannot be changed  

---

### 🔸 Null Handling

- Wrapper classes can store **null values**
- Primitive types cannot store null  

---

### 🔸 Performance Consideration

- Wrapper classes are slower than primitives  
- Because objects require more memory and processing  

---

### 🔸 When to Use Wrapper Classes

- When working with **Collections**
- When null values are needed  
- When using utility methods  
- When interacting with APIs  

---

### 🔸 When NOT to Use

- In performance-critical code  
- When simple arithmetic operations are required  

---

### 🔸 Key Differences: Primitive vs Wrapper

| Feature | Primitive | Wrapper Class |
|--------|----------|--------------|
| Type | Basic data type | Object |
| Memory | Less | More |
| Performance | Faster | Slower |
| Null Support | ❌ No | ✅ Yes |
| Methods | ❌ No | ✅ Yes |

---

### 🔸 Key Points

- Wrapper classes convert primitives into objects  
- Required for Collections and APIs  
- Support autoboxing and unboxing  
- Provide useful utility methods  
- Slightly slower than primitives  