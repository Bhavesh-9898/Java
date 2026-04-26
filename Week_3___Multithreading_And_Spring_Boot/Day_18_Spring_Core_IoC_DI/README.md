# Day 18 — Spring Core: IoC, DI & Bean Lifecycle

📅 **Date:** April 24, 2026  
📚 **Topics:** IoC Container, Dependency Injection, Bean Lifecycle, Bean Scopes, Key Annotations  

---

## 📖 Notes

### 1. Inversion of Control (IoC)

**IoC** = Framework controls object creation and lifecycle, NOT the developer.

```
Traditional:                    Spring IoC:
┌──────────┐                   ┌──────────┐
│  MyClass  │ creates →         │  Spring   │ creates & injects
│           │ dependencies      │ Container │ dependencies
└──────────┘                   └──────────┘
                                     ↓
                               ┌──────────┐
                               │  MyClass  │ receives dependencies
                               └──────────┘
```

### 2. Dependency Injection (DI)

| Type | Example | Recommended? |
|------|---------|:---:|
| **Constructor** | `@Autowired` on constructor | ✅ Best |
| **Setter** | `@Autowired` on setter | Optional deps |
| **Field** | `@Autowired` on field | ❌ Hard to test |

```java
// ✅ Constructor Injection (recommended)
@Service
public class UserService {
    private final UserRepository userRepository;

    // @Autowired is optional if single constructor (Spring 4.3+)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

### 3. Bean Lifecycle

```
Instantiation → Populate Properties → @PostConstruct → afterPropertiesSet()
    → Custom init → READY → @PreDestroy → destroy() → Custom destroy
```

### 4. Bean Scopes

| Scope | Description | Default? |
|-------|-------------|:---:|
| `singleton` | One instance per container | ✅ |
| `prototype` | New instance per request | |
| `request` | One per HTTP request (web) | |
| `session` | One per HTTP session (web) | |
| `application` | One per ServletContext | |

### 5. Key Annotations

| Annotation | Purpose |
|-----------|---------|
| `@Component` | Generic Spring-managed bean |
| `@Service` | Business logic layer |
| `@Repository` | Data access layer (+ exception translation) |
| `@Controller` | MVC controller (returns views) |
| `@RestController` | REST controller (`@Controller` + `@ResponseBody`) |
| `@Autowired` | Inject dependency |
| `@Qualifier` | Specify which bean to inject (when multiple) |
| `@Bean` | Declare bean in `@Configuration` class |
| `@Configuration` | Declares configuration class |
| `@Value` | Inject property values |
| `@Scope` | Set bean scope |
| `@Primary` | Default bean when multiple candidates |

---

## 📝 Code Example — Spring Boot Project

### Project Structure
```
src/main/java/com/example/demo/
├── DemoApplication.java
├── controller/
│   └── UserController.java
├── service/
│   └── UserService.java
├── repository/
│   └── UserRepository.java
└── model/
    └── User.java
```

### UserController.java
```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
```

### UserService.java
```java
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found: " + id));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
```

---

## 🔑 Key Interview Questions

1. **What is IoC?** — Framework manages object lifecycle and dependencies
2. **Why prefer constructor injection?** — Immutable dependencies, easier testing, enforces required deps
3. **Difference between @Component, @Service, @Repository?** — Semantic difference; @Repository adds exception translation
4. **What is the default bean scope?** — Singleton
5. **@Bean vs @Component?** — @Bean in @Configuration for 3rd-party classes; @Component for your classes

---

## ✅ Practice Exercises

1. Create a Spring Boot project using [start.spring.io](https://start.spring.io)
2. Implement a Service injected into a Controller using constructor injection
3. Test different bean scopes (singleton vs prototype)
