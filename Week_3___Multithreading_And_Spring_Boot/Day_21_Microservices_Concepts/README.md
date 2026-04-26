# Day 21 — Microservices Concepts + Week 3 Revision

📅 **Date:** April 27, 2026  
📚 **Topics:** Microservices Architecture, Key Patterns, Communication  

---

## 📖 Notes

### 1. Microservices Architecture

```
                    ┌──────────────────┐
                    │   API Gateway    │  ← Single entry point
                    │  (Spring Cloud   │     (routing, auth, rate limiting)
                    │   Gateway)       │
                    └────────┬─────────┘
                             │
              ┌──────────────┼──────────────┐
              │              │              │
    ┌─────────▼───┐  ┌──────▼──────┐  ┌───▼──────────┐
    │ User Service │  │Order Service│  │Product Service│
    │    (8081)    │  │   (8082)    │  │    (8083)     │
    │  ┌────────┐  │  │ ┌────────┐ │  │ ┌──────────┐ │
    │  │User DB │  │  │ │Order DB│ │  │ │Product DB│ │
    │  └────────┘  │  │ └────────┘ │  │ └──────────┘ │
    └──────────────┘  └────────────┘  └──────────────┘
              │              │              │
              └──────────────┼──────────────┘
                             │
                    ┌────────▼─────────┐
                    │ Service Discovery│  ← Eureka / Consul
                    │    (Eureka)      │
                    └──────────────────┘
```

### 2. Key Patterns

| Pattern | Tool/Library | Purpose |
|---------|-------------|---------|
| **API Gateway** | Spring Cloud Gateway | Single entry point, routing, security |
| **Service Discovery** | Eureka, Consul | Dynamic service registration & lookup |
| **Circuit Breaker** | Resilience4j | Prevent cascading failures |
| **Config Server** | Spring Cloud Config | Centralized configuration |
| **Load Balancer** | Spring Cloud LoadBalancer | Distribute traffic |
| **Distributed Tracing** | Zipkin, Sleuth | Track requests across services |

### 3. Communication

| Type | Technology | When to Use |
|------|-----------|-------------|
| **Synchronous** | REST (HTTP), gRPC | Request-response, real-time |
| **Asynchronous** | Kafka, RabbitMQ | Event-driven, decoupled, high throughput |

### 4. Pros & Cons

| Pros | Cons |
|------|------|
| Independent deployment | Increased complexity |
| Technology diversity | Network latency |
| Scalability per service | Distributed debugging |
| Fault isolation | Data consistency challenges |
| Team autonomy | Operational overhead |

### 5. Monolith vs Microservices

| Aspect | Monolith | Microservices |
|--------|----------|--------------|
| Deployment | Single unit | Independent services |
| Scaling | Scale everything | Scale per service |
| Database | Shared DB | Database per service |
| Communication | In-process calls | Network calls (REST/messaging) |
| Complexity | Simple initially | Complex infrastructure |
| Best for | Small teams, MVPs | Large teams, complex domains |

### 6. Circuit Breaker Pattern (Resilience4j)

```
CLOSED → (failures > threshold) → OPEN → (wait timeout) → HALF_OPEN
  ↑                                                            │
  └────────────── (success) ───────────────────────────────────┘

CLOSED: Requests pass through normally
OPEN: Requests fail immediately (fallback)
HALF_OPEN: Allow limited requests to test recovery
```

```java
@CircuitBreaker(name = "userService", fallbackMethod = "getUserFallback")
public User getUser(Long id) {
    return restTemplate.getForObject(url, User.class);
}

public User getUserFallback(Long id, Exception e) {
    return new User("Unknown", "Service unavailable");
}
```

### 7. 12-Factor App Principles

1. **Codebase** — One codebase, many deploys
2. **Dependencies** — Explicitly declare (Maven/Gradle)
3. **Config** — Store in environment
4. **Backing Services** — Treat as attached resources
5. **Build, Release, Run** — Strictly separate stages
6. **Processes** — Stateless processes
7. **Port Binding** — Export services via port
8. **Concurrency** — Scale via process model
9. **Disposability** — Fast startup, graceful shutdown
10. **Dev/Prod Parity** — Keep environments similar
11. **Logs** — Treat as event streams
12. **Admin Processes** — Run as one-off processes

---

## 🔑 Key Interview Questions

1. **What are microservices?** — Small, independent services each owning their data
2. **How do microservices communicate?** — Sync (REST/gRPC) or Async (Kafka/RabbitMQ)
3. **What is a Circuit Breaker?** — Prevents cascading failures by stopping calls to failing services
4. **API Gateway purpose?** — Single entry point for routing, auth, rate limiting
5. **Service Discovery?** — Dynamic registration/lookup so services find each other
6. **When NOT to use microservices?** — Small teams, simple apps, MVPs

---

## ✅ Week 3 Revision Checklist

- [ ] Thread creation — 3 approaches
- [ ] synchronized vs volatile
- [ ] Producer-Consumer with wait/notify
- [ ] ExecutorService, CountDownLatch, Semaphore
- [ ] Deadlock — 4 conditions and prevention
- [ ] Spring IoC, DI — constructor injection
- [ ] Spring annotations — @Component, @Service, @Repository, etc.
- [ ] REST API — CRUD operations, ResponseEntity
- [ ] JPA — Entities, relationships, repositories
- [ ] N+1 problem — detection and 3 solutions
- [ ] Microservices patterns — Gateway, Discovery, Circuit Breaker
