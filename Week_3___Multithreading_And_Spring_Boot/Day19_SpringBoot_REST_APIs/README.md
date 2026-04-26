# Day 19 — Spring Boot REST APIs

📅 **Date:** April 25, 2026  
📚 **Topics:** REST Annotations, Request Handling, Exception Handling, Configuration  

---

## 📖 Notes

### 1. REST API Annotations

| Annotation | HTTP Method | Purpose |
|-----------|-------------|---------|
| `@GetMapping` | GET | Retrieve resources |
| `@PostMapping` | POST | Create resource |
| `@PutMapping` | PUT | Full update |
| `@PatchMapping` | PATCH | Partial update |
| `@DeleteMapping` | DELETE | Delete resource |

### 2. Request Handling

```java
@GetMapping("/users/{id}")
public User getUser(
    @PathVariable Long id,                    // From URL path
    @RequestParam(defaultValue = "false") boolean detailed,  // ?detailed=true
    @RequestHeader("Authorization") String token  // From headers
) { ... }

@PostMapping("/users")
public ResponseEntity<User> createUser(@RequestBody User user) {
    User saved = service.save(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
}
```

### 3. ResponseEntity

```java
// Full control over response
return ResponseEntity.ok(user);                     // 200
return ResponseEntity.status(201).body(user);       // 201 Created
return ResponseEntity.notFound().build();            // 404
return ResponseEntity.noContent().build();           // 204
return ResponseEntity.badRequest().body(error);      // 400
```

### 4. Global Exception Handling

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFound(ResourceNotFoundException ex) {
        return new ErrorResponse(404, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleGeneral(Exception ex) {
        return new ErrorResponse(500, "Internal server error");
    }
}
```

### 5. Configuration

```yaml
# application.yml
server:
  port: 8080

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/mydb
    username: root
    password: pass
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

# Profiles
---
spring:
  config:
    activate:
      on-profile: dev
  datasource:
    url: jdbc:h2:mem:devdb
```

---

## 📝 Full CRUD REST API Example

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return productService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody @Valid Product product) {
        Product saved = productService.save(product);
        URI location = URI.create("/api/products/" + saved.getId());
        return ResponseEntity.created(location).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id,
                                          @RequestBody @Valid Product product) {
        return productService.update(id, product)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (productService.delete(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
```

---

## 🔑 Key Interview Questions

1. **@Controller vs @RestController?** — @RestController = @Controller + @ResponseBody (returns JSON, not views)
2. **@PathVariable vs @RequestParam?** — Path: `/users/1`, Param: `/users?id=1`
3. **How to handle exceptions globally?** — @ControllerAdvice + @ExceptionHandler
4. **What is ResponseEntity?** — Full HTTP response (status + headers + body)
5. **How to activate profiles?** — `spring.profiles.active=dev` or `-Dspring.profiles.active=dev`

---

## ✅ Practice Exercises

1. Build a CRUD REST API for a `Product` entity
2. Add global exception handling with `@ControllerAdvice`
3. Test endpoints using Postman or curl
