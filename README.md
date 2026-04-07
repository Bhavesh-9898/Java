# 📚 One-Month Study Plan — Java, Spring Boot, SQL, Testing & Git

**Duration:** April 7 – May 6, 2026 (30 Days)
**Daily Study:** ~3–4 hours recommended
**Goal:** Master all fundamentals for interview readiness

---

## 🗓️ Week 1 — Core Java Fundamentals (April 7–13)

### Day 1 (April 7) — JVM Architecture & Data Types
| Topic | Key Concepts |
|---|---|
| JVM, JRE, JDK | JVM internals (ClassLoader, JIT, GC), JRE = JVM + Libraries, JDK = JRE + Tools |
| Data Types | 8 primitives (byte, short, int, long, float, double, char, boolean), Reference types, default values |

**Practice:** Draw the JVM architecture diagram from memory. Write a program using all 8 primitive types.

---

### Day 2 (April 8) — Variables, Operators & Control Flow
| Topic | Key Concepts |
|---|---|
| Variables | Local, Instance, Static, final — scope, default values, memory location (Stack vs Heap) |
| Operators | Arithmetic, Relational, Logical, Bitwise, Ternary, instanceof, precedence |
| Control Flow | if-else, switch, for, enhanced for, while, do-while, break, continue, return |

**Practice:** Write programs demonstrating variable shadowing, operator precedence tricks, and nested loop patterns.

---

### Day 3 (April 9) — Strings & Arrays
| Topic | Key Concepts |
|---|---|
| String | Immutability, String Pool, `new String()` vs literal, common methods |
| StringBuilder vs StringBuffer | Mutable, thread-safety difference, when to use which |
| Arrays | Declaration, initialization, multidimensional, `length` property, limitations |

**Practice:** Reverse a string using StringBuilder. Implement matrix addition with 2D arrays.

---

### Day 4 (April 10) — Wrapper Classes & Exception Handling
| Topic | Key Concepts |
|---|---|
| Wrapper Classes | Autoboxing, Unboxing, utility methods (`parseInt`, `valueOf`), why needed for Collections |
| Exception Handling | try-catch-finally, throw vs throws, Checked vs Unchecked, custom exceptions |

**Practice:** Write a custom `InsufficientBalanceException`. Handle multiple exceptions in a single try block.

---

### Day 5 (April 11) — Access Modifiers, this/super, static & final
| Topic | Key Concepts |
|---|---|
| Access Modifiers | public, private, protected, default — visibility table |
| this & super | Constructor chaining, method/variable access |
| static | static variable, method, block, nested class — "Can a static method be overridden?" (No — method hiding) |
| final | final variable, method, class — reference vs value immutability |

**Practice:** Create a class hierarchy demonstrating `this()` and `super()` chaining. Prove `final` reference types can have mutable contents.

---

### Day 6 (April 12) — Garbage Collection, Serialization & Generics
| Topic | Key Concepts |
|---|---|
| Garbage Collection | Heap generations (Young, Old), Mark-Sweep, G1/ZGC, `System.gc()` is only a hint |
| Serialization | `Serializable` marker interface, `transient` keyword, ObjectInputStream/ObjectOutputStream |
| Generics | Type safety, Type Erasure, Wildcards (`?`, `? extends T`, `? super T`), PECS principle |

**Practice:** Serialize/deserialize an object with a transient field. Write a generic method that accepts upper-bounded wildcards.

---

### Day 7 (April 13) — Java 8 Features + Week 1 Revision
| Topic | Key Concepts |
|---|---|
| Lambda Expressions | Syntax, functional interface implementation |
| Functional Interfaces | `Predicate`, `Function`, `Consumer`, `Supplier`, `@FunctionalInterface` |
| Stream API | Intermediate (filter, map, sorted) vs Terminal (collect, forEach, reduce), lazy evaluation |
| Optional | `ofNullable`, `orElse`, `orElseThrow`, `ifPresent` |
| Default Methods | In interfaces, backward compatibility |
| Date/Time API | `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, `Duration`, `Period` |

**Practice:** Rewrite a traditional for-loop filtering + mapping logic using Streams. Use Optional to safely handle nullable values.

> [!TIP]
> **Revision:** Spend 1 hour revisiting Days 1–6 topics. Write short notes or flashcards for quick recall.

---

## 🗓️ Week 2 — OOP & Collections Framework (April 14–20)

### Day 8 (April 14) — Encapsulation & Inheritance
| Topic | Key Concepts |
|---|---|
| Encapsulation | Private fields + public getters/setters, validation in setters, data hiding |
| Inheritance | `extends`, single/multilevel/hierarchical, no multiple inheritance for classes, "is-a" relationship |

**Practice:** Build a `BankAccount` class with encapsulation. Create a `Vehicle → Car → ElectricCar` hierarchy.

---

### Day 9 (April 15) — Polymorphism & Abstraction
| Topic | Key Concepts |
|---|---|
| Compile-time Polymorphism | Method Overloading (same name, different signatures) |
| Runtime Polymorphism | Method Overriding, Dynamic Method Dispatch, overriding rules |
| Abstraction | Abstract classes vs Interfaces, when to use which, default/static methods in interfaces (Java 8+) |

**Practice:** Write a `Shape` abstract class with `Circle` and `Rectangle` subclasses. Implement a `Drawable` interface.

---

### Day 10 (April 16) — Constructors, equals/hashCode & Composition
| Topic | Key Concepts |
|---|---|
| Constructors | Default, no-arg, parameterized, overloading, chaining (`this()`, `super()`) |
| equals() & hashCode() | Contract between them, why override both, impact on HashMap/HashSet |
| Composition vs Inheritance | "has-a" vs "is-a", favor composition, loose coupling |

**Practice:** Override `equals()` and `hashCode()` for an `Employee` class. Test with `HashSet` to prove correctness.

---

### Day 11 (April 17) — Design Patterns
| Topic | Key Concepts |
|---|---|
| Singleton | Eager, Lazy, Double-Checked Locking, Bill Pugh (static inner class), Enum Singleton |
| Factory Method | Creator → ConcreteCreator, Product → ConcreteProduct |
| Builder | Step-by-step construction, method chaining, avoids telescoping constructors |
| Observer | Subject-Observer, one-to-many notification, event systems |

**Practice:** Implement all 4 patterns with small working examples.

---

### Day 12 (April 18) — Collections: List & Set
| Topic | Key Concepts |
|---|---|
| Collection Hierarchy | Iterable → Collection → List / Set / Queue; Map is separate |
| ArrayList vs LinkedList | Internal structure, time complexities (get, add, remove), use cases |
| HashSet vs LinkedHashSet vs TreeSet | Ordering, nulls, internal data structure, time complexities |

**Practice:** Benchmark `ArrayList.get()` vs `LinkedList.get()` for large lists. Demonstrate `TreeSet` natural ordering.

---

### Day 13 (April 19) — Collections: Map & Queue
| Topic | Key Concepts |
|---|---|
| HashMap | Array + LinkedList/Red-Black Tree (Java 8+), hashing, O(1) average, allows 1 null key |
| LinkedHashMap vs TreeMap | Insertion order vs sorted order, null key rules |
| HashMap vs Hashtable | Thread-safety, null handling, legacy status |
| Queue & Deque | FIFO, PriorityQueue, ArrayDeque |

**Practice:** Implement a word frequency counter using `HashMap`. Use `PriorityQueue` for a min-heap example.

---

### Day 14 (April 20) — Concurrent Collections, Comparable/Comparator + Week 2 Revision
| Topic | Key Concepts |
|---|---|
| Thread-Safe Collections | `Collections.synchronizedList()`, `ConcurrentHashMap`, `CopyOnWriteArrayList` |
| Fail-Fast vs Fail-Safe | `ConcurrentModificationException`, iterator behavior |
| Comparable vs Comparator | `compareTo()` vs `compare()`, natural vs custom ordering, lambda usage |

**Practice:** Sort a list of `Person` objects by age (Comparable) and by name (Comparator). Demonstrate `ConcurrentHashMap` thread-safety.

> [!TIP]
> **Revision:** Spend 1 hour reviewing OOP pillars and Collections hierarchy. Draw the hierarchy from memory.

---

## 🗓️ Week 3 — Multithreading & Spring Boot (April 21–27)

### Day 15 (April 21) — Thread Basics & Lifecycle
| Topic | Key Concepts |
|---|---|
| Thread Creation | `extends Thread` vs `implements Runnable` (preferred) vs `Callable + Future` |
| Thread Lifecycle | NEW → RUNNABLE → BLOCKED/WAITING/TIMED_WAITING → TERMINATED |
| Key Methods | `start()`, `run()`, `sleep()`, `join()`, `yield()` |

**Practice:** Create threads using all 3 approaches. Print thread states during execution.

---

### Day 16 (April 22) — Synchronization & Inter-Thread Communication
| Topic | Key Concepts |
|---|---|
| synchronized | Method-level vs block-level, intrinsic locks, re-entrant locking |
| volatile | Visibility guarantee only, NOT atomicity |
| wait/notify/notifyAll | Inter-thread communication, must be inside `synchronized`, Producer-Consumer |

**Practice:** Implement a Producer-Consumer using `wait()`/`notify()`.

---

### Day 17 (April 23) — Thread Pools, Concurrency Utilities & Deadlock
| Topic | Key Concepts |
|---|---|
| ExecutorService | `newFixedThreadPool`, `newCachedThreadPool`, `newSingleThreadExecutor`, shutdown |
| Concurrency Utilities | `ReentrantLock`, `CountDownLatch`, `CyclicBarrier`, `Semaphore`, `BlockingQueue`, `AtomicInteger` |
| Deadlock | 4 Coffman conditions, prevention strategies, detection via thread dumps |

**Practice:** Use `CountDownLatch` to wait for 3 threads. Write a deadlock example, then fix it by ordering locks.

---

### Day 18 (April 24) — Spring Core: IoC, DI & Bean Lifecycle
| Topic | Key Concepts |
|---|---|
| IoC & Dependency Injection | Constructor (recommended) vs Setter vs Field injection |
| Bean Lifecycle | Instantiation → Populate Properties → Init → Ready → Destroy |
| Bean Scopes | singleton (default), prototype, request, session |
| Key Annotations | `@Component`, `@Service`, `@Repository`, `@Controller`, `@RestController`, `@Autowired`, `@Qualifier`, `@Bean`, `@Configuration` |

**Practice:** Create a Spring Boot project with a Service injected into a Controller using constructor injection.

---

### Day 19 (April 25) — Spring Boot REST APIs
| Topic | Key Concepts |
|---|---|
| REST Annotations | `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, `@PatchMapping` |
| Request Handling | `@PathVariable`, `@RequestParam`, `@RequestBody`, `ResponseEntity` |
| Exception Handling | `@ExceptionHandler`, `@ControllerAdvice`, `@ResponseStatus` |
| Configuration | `application.properties` / `application.yml`, profiles |

**Practice:** Build a CRUD REST API for a `Product` entity with proper exception handling and `ResponseEntity`.

---

### Day 20 (April 26) — Spring Data JPA & Hibernate
| Topic | Key Concepts |
|---|---|
| ORM Concept | Object ↔ Table mapping, JPA = specification, Hibernate = implementation |
| Entity Annotations | `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`, relationship annotations |
| Repositories | `CrudRepository` vs `JpaRepository`, derived query methods, `@Query` |
| Lazy vs Eager Loading | Defaults, N+1 problem, `JOIN FETCH`, `@EntityGraph`, `@BatchSize` |

**Practice:** Create `Author` and `Book` entities with `@OneToMany`. Write a `JOIN FETCH` query to solve N+1.

---

### Day 21 (April 27) — Microservices Concepts + Week 3 Revision
| Topic | Key Concepts |
|---|---|
| Microservices Architecture | Independent services, own database, lightweight communication |
| Key Patterns | API Gateway, Service Discovery (Eureka), Circuit Breaker (Resilience4j), Config Server |
| Communication | Synchronous (REST) vs Asynchronous (Kafka, RabbitMQ) |
| Pros & Cons | Scalability & resilience vs complexity & operational overhead |

**Practice:** Draw a microservices architecture diagram with API Gateway, Service Discovery, and 3 services.

> [!TIP]
> **Revision:** Review multithreading synchronization mechanisms and Spring annotations. Write a cheat sheet.

---

## 🗓️ Week 4 — Database, Testing, Git & Final Review (April 28 – May 6)

### Day 22 (April 28) — RDBMS, SQL & ACID
| Topic | Key Concepts |
|---|---|
| RDBMS Concepts | Tables, rows, columns, PK, FK, schema |
| ACID Properties | Atomicity, Consistency, Isolation (4 levels), Durability |
| SQL | DML (SELECT, INSERT, UPDATE, DELETE), DDL (CREATE, ALTER, DROP), DCL, TCL |
| Joins & Aggregations | INNER, LEFT, RIGHT, FULL OUTER, GROUP BY, HAVING, subqueries |
| Indexes | Clustered vs Non-Clustered, when to use, trade-offs |

**Practice:** Write SQL queries for: multi-table JOINs, GROUP BY with HAVING, and a subquery. Explain each isolation level with an example.

---

### Day 23 (April 29) — JDBC, JPA, Hibernate Internals & Normalization
| Topic | Key Concepts |
|---|---|
| JDBC | Connection steps, `Statement` vs `PreparedStatement` (SQL injection!) |
| JPA & Hibernate | EntityManager, JPQL, First-Level vs Second-Level cache, Dirty Checking |
| N+1 Problem | Detection, solutions (JOIN FETCH, @EntityGraph, batch fetching, DTOs) |
| Normalization | 1NF, 2NF, 3NF, BCNF — purpose and when to denormalize |

**Practice:** Explain the N+1 problem with an example and 3 solutions. Normalize a sample table to 3NF.

---

### Day 24 (April 30) — Unit Testing (JUnit 5 + Mockito)
| Topic | Key Concepts |
|---|---|
| JUnit 5 | `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`, `@DisplayName`, `@Disabled`, `@ParameterizedTest` |
| Assertions | `assertEquals`, `assertTrue`, `assertNotNull`, `assertThrows` |
| Mockito | `@Mock`, `@InjectMocks`, `@Spy`, `when().thenReturn()`, `verify()`, argument matchers |
| Mock vs Spy | Mock = fully fake; Spy = real object with selective overrides |

**Practice:** Write unit tests for a `UserService` mocking the `UserRepository`. Use `@Spy` on a `Calculator` class.

---

### Day 25 (May 1) — Integration Testing & TDD
| Topic | Key Concepts |
|---|---|
| Spring Boot Test | `@SpringBootTest`, `@WebMvcTest`, `@DataJpaTest`, `MockMvc` |
| Testcontainers | Spin up real DB in Docker for tests |
| TDD | Red → Green → Refactor cycle, benefits |
| Code Coverage | JaCoCo, line/branch/method coverage, limitations of high coverage |

**Practice:** Write a `@WebMvcTest` for a controller using `MockMvc`. Practice one TDD cycle for a small feature.

---

### Day 26 (May 2) — Git Basics & Branching
| Topic | Key Concepts |
|---|---|
| Git Basics | DVCS, repo, commit, branch, HEAD, staging area, working directory |
| Core Commands | `init`, `clone`, `status`, `add`, `commit`, `log`, `diff`, `push`, `pull`, `fetch` |
| Branching | `branch`, `checkout`, `merge` (fast-forward vs 3-way), `rebase` (never on public branches!) |
| Strategies | Git Flow vs GitHub Flow |

**Practice:** Create a repo, make a feature branch, commit changes, merge back to main. Try a rebase workflow.

---

### Day 27 (May 3) — Git Advanced & Project Management
| Topic | Key Concepts |
|---|---|
| Conflict Resolution | Conflict markers, manual resolution |
| reset vs revert | `revert` = safe (new commit), `reset` = rewrites history (soft/mixed/hard) |
| git stash | Save WIP, `stash pop`, `stash apply`, `stash list` |
| .gitignore | IDE files, build outputs, logs, sensitive configs |
| Agile & Scrum | Sprints, ceremonies (Planning, Standup, Review, Retro), roles (PO, SM, Dev Team) |
| Kanban & JIRA | Visualize flow, WIP limits, backlog management |

**Practice:** Simulate a merge conflict and resolve it. Practice `stash`, `reset --soft`, and `revert`.

---

### Day 28 (May 4) — Full Topic Revision Day
| Time | Activity |
|---|---|
| Hour 1 | Core Java — JVM, Data Types, Strings, Exception Handling, Java 8 |
| Hour 2 | OOP — 4 Pillars, Constructors, equals/hashCode, Design Patterns |
| Hour 3 | Collections — Hierarchy, HashMap internals, ConcurrentHashMap, Comparable vs Comparator |
| Hour 4 | Multithreading — Synchronization, ExecutorService, Deadlock |

> [!IMPORTANT]
> Focus on areas you found difficult. Re-read your notes and flashcards.

---

### Day 29 (May 5) — Full Topic Revision Day
| Time | Activity |
|---|---|
| Hour 1 | Spring Boot — IoC/DI, Annotations, REST API, Exception Handling |
| Hour 2 | Database — ACID, SQL queries, JPA/Hibernate, N+1 Problem |
| Hour 3 | Testing — JUnit, Mockito, Mock vs Spy, TDD, Integration Testing |
| Hour 4 | Git — Commands, Branching, reset vs revert, stash, Agile/Scrum |

---

### Day 30 (May 6) — Mock Interview Day 🎯
| Time | Activity |
|---|---|
| Hour 1 | **Self-Interview:** Answer 10 Core Java + OOP questions out loud |
| Hour 2 | **Self-Interview:** Answer 10 Collections + Multithreading questions out loud |
| Hour 3 | **Self-Interview:** Answer 10 Spring Boot + Database + Testing questions out loud |
| Hour 4 | **Coding Round Practice:** Solve 2–3 problems using Streams, Collections, and SQL |

> [!CAUTION]
> Don't just read — **explain out loud** as if you're in an interview. This builds recall and confidence.

---

## 📋 Quick Reference — Weekly Summary

| Week | Days | Focus Area | Weight |
|---|---|---|---|
| **Week 1** | April 7–13 | Core Java Fundamentals + Java 8 | 25% |
| **Week 2** | April 14–20 | OOP + Collections Framework | 25% |
| **Week 3** | April 21–27 | Multithreading + Spring Boot + Microservices | 25% |
| **Week 4** | April 28 – May 6 | Database + Testing + Git + Revision | 25% |

---

## 💡 Daily Study Tips

1. **First 30 min** — Revise previous day's topics (spaced repetition)
2. **Next 2–2.5 hours** — Study new topics deeply with code examples
3. **Last 30–60 min** — Practice (write code, solve a problem, or explain a concept aloud)
4. **Keep a notebook** — Write 5 key points per topic for last-day revision
5. **Weekends** — Use revision days to fill gaps, don't skip them

> [!NOTE]
> This plan is based on ~3–4 hours/day. If you have more time, add coding practice (LeetCode/HackerRank) or build a small Spring Boot CRUD project alongside.

---

*Good luck with your preparation! 🚀*
