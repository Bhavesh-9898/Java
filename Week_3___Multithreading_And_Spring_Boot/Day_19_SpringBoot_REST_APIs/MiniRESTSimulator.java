import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Day 19 — Fun Example: Mini REST API Simulator 🌐
 * 
 * Simulates how Spring Boot REST APIs work — WITHOUT Spring!
 * Shows request routing, path variables, request/response handling.
 * 
 * Run this to understand what @GetMapping, @PostMapping, etc. actually DO.
 */
public class MiniRESTSimulator {

    // In-memory database (like what JPA + H2 would do)
    static Map<Integer, Student> database = new LinkedHashMap<>();
    static int nextId = 1;

    public static void main(String[] args) {
        System.out.println("=== 🌐 Mini REST API Simulator ===");
        System.out.println("(Simulates Spring Boot REST Controller behavior)\n");

        // Seed some data
        database.put(nextId++, new Student(1, "Alice", "alice@email.com", "Computer Science", 3.8));
        database.put(nextId++, new Student(2, "Bob", "bob@email.com", "Mathematics", 3.5));
        database.put(nextId++, new Student(3, "Charlie", "charlie@email.com", "Physics", 3.9));

        // --- Simulate REST API calls ---

        // GET /api/students
        simulateRequest("GET", "/api/students", null);

        // GET /api/students/2
        simulateRequest("GET", "/api/students/2", null);

        // GET /api/students/99 (not found)
        simulateRequest("GET", "/api/students/99", null);

        // POST /api/students
        simulateRequest("POST", "/api/students",
            new Student(0, "Diana", "diana@email.com", "Biology", 3.7));

        // PUT /api/students/2
        simulateRequest("PUT", "/api/students/2",
            new Student(0, "Bob Updated", "bob.new@email.com", "Data Science", 3.6));

        // DELETE /api/students/1
        simulateRequest("DELETE", "/api/students/1", null);

        // GET all again to see changes
        simulateRequest("GET", "/api/students", null);
    }

    // ==========================================
    // 🎯 REQUEST ROUTER (like Spring's DispatcherServlet)
    // ==========================================
    static void simulateRequest(String method, String path, Object body) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📨 " + method + " " + path + " [" + timestamp + "]");
        if (body != null) System.out.println("📦 Body: " + body);
        System.out.println();

        // Route to appropriate handler
        try {
            ResponseEntity response;

            if (path.equals("/api/students") && method.equals("GET")) {
                response = getAllStudents();
            } else if (path.matches("/api/students/\\d+") && method.equals("GET")) {
                int id = extractId(path);
                response = getStudentById(id);
            } else if (path.equals("/api/students") && method.equals("POST")) {
                response = createStudent((Student) body);
            } else if (path.matches("/api/students/\\d+") && method.equals("PUT")) {
                int id = extractId(path);
                response = updateStudent(id, (Student) body);
            } else if (path.matches("/api/students/\\d+") && method.equals("DELETE")) {
                int id = extractId(path);
                response = deleteStudent(id);
            } else {
                response = new ResponseEntity(404, "Not Found", "No endpoint: " + method + " " + path);
            }

            // Print response
            System.out.println("📤 Response: HTTP " + response.status + " " + response.statusText);
            if (response.body != null) {
                if (response.body instanceof List) {
                    List<?> list = (List<?>) response.body;
                    System.out.println("   [");
                    for (Object item : list) System.out.println("     " + item + ",");
                    System.out.println("   ]");
                } else {
                    System.out.println("   " + response.body);
                }
            }
        } catch (Exception e) {
            System.out.println("📤 Response: HTTP 500 Internal Server Error");
            System.out.println("   " + e.getMessage());
        }
        System.out.println();
    }

    // ==========================================
    // 📋 CONTROLLER METHODS (like @GetMapping, @PostMapping, etc.)
    // ==========================================

    // @GetMapping("/api/students")
    static ResponseEntity getAllStudents() {
        return new ResponseEntity(200, "OK", new ArrayList<>(database.values()));
    }

    // @GetMapping("/api/students/{id}")
    static ResponseEntity getStudentById(int id) {
        Student student = database.get(id);
        if (student == null) {
            return new ResponseEntity(404, "Not Found",
                Map.of("error", "Student not found with id: " + id));
        }
        return new ResponseEntity(200, "OK", student);
    }

    // @PostMapping("/api/students")
    static ResponseEntity createStudent(Student student) {
        student = new Student(nextId, student.name, student.email, student.department, student.gpa);
        database.put(nextId++, student);
        return new ResponseEntity(201, "Created", student);
    }

    // @PutMapping("/api/students/{id}")
    static ResponseEntity updateStudent(int id, Student updated) {
        if (!database.containsKey(id)) {
            return new ResponseEntity(404, "Not Found", "Student not found: " + id);
        }
        updated = new Student(id, updated.name, updated.email, updated.department, updated.gpa);
        database.put(id, updated);
        return new ResponseEntity(200, "OK", updated);
    }

    // @DeleteMapping("/api/students/{id}")
    static ResponseEntity deleteStudent(int id) {
        Student removed = database.remove(id);
        if (removed == null) {
            return new ResponseEntity(404, "Not Found", "Student not found: " + id);
        }
        return new ResponseEntity(204, "No Content", null);
    }

    static int extractId(String path) {
        String[] parts = path.split("/");
        return Integer.parseInt(parts[parts.length - 1]);
    }
}

// --- ResponseEntity (like Spring's ResponseEntity) ---
class ResponseEntity {
    int status;
    String statusText;
    Object body;

    ResponseEntity(int status, String statusText, Object body) {
        this.status = status;
        this.statusText = statusText;
        this.body = body;
    }
}

// --- Student Model (like @Entity) ---
class Student {
    int id;
    String name;
    String email;
    String department;
    double gpa;

    Student(int id, String name, String email, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("{id:%d, name:'%s', email:'%s', dept:'%s', gpa:%.1f}",
                id, name, email, department, gpa);
    }
}
