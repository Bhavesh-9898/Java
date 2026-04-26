# 📘 Day 18 — Spring Core: IoC, DI & Bean Lifecycle

---

## 🔹 What is Spring Framework?

Spring is a popular Java framework used to build enterprise applications with loose coupling, scalability, and easier development.

---

## 🔹 IoC (Inversion of Control)

IoC means control of object creation and dependency management is transferred from programmer to Spring Container.

### Traditional Way:
- Developer creates objects manually using `new`

### Spring Way:
- Spring container creates and manages objects (beans)

---

## 🔹 Dependency Injection (DI)

Dependency Injection is a design pattern where required dependencies are provided by the container.

---

## 🔸 Types of Injection

### 1. Constructor Injection ✅ Recommended
- Dependencies passed through constructor
- Easier testing
- Supports immutability

### 2. Setter Injection
- Dependencies set using setter methods
- Useful for optional dependencies

### 3. Field Injection
- Dependencies injected directly into fields
- Easy but less testable

---

## 🔹 Bean Lifecycle

A bean goes through these stages:

1. Instantiation  
2. Populate Properties  
3. Initialization  
4. Ready for Use  
5. Destruction

---

## 🔹 Bean Scopes

### singleton (default)
- One bean instance per container

### prototype
- New bean every request from container

### request
- One bean per HTTP request

### session
- One bean per HTTP session

---

## 🔹 Important Annotations

### Stereotype Annotations

- `@Component` → generic bean
- `@Service` → service layer
- `@Repository` → persistence layer
- `@Controller` → MVC controller
- `@RestController` → REST API controller

---

### Injection Annotations

- `@Autowired` → inject dependency
- `@Qualifier` → choose specific bean

---

### Configuration Annotations

- `@Bean` → method returns bean
- `@Configuration` → configuration class

---

## 🔹 Key Points

- IoC shifts control to Spring
- DI reduces tight coupling
- Constructor injection is preferred
- Bean scope decides lifecycle/instances