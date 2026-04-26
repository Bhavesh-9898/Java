import java.util.*;

/**
 * Day 18 — Fun Example: Bean Lifecycle Simulator 🌱
 * 
 * Simulates the Spring Bean lifecycle stages using plain Java.
 * Shows what happens when Spring creates, initializes, and destroys beans.
 * 
 * Lifecycle: Constructor → Set Properties → @PostConstruct → Ready → @PreDestroy
 */
public class BeanLifecycleSimulator {

    public static void main(String[] args) {
        System.out.println("=== 🌱 Spring Bean Lifecycle Simulator ===\n");

        // Simulate Spring Container starting up
        System.out.println("🏗️ Spring Container starting...\n");

        // --- SINGLETON Scope (default) ---
        System.out.println("--- Singleton Scope ---");
        DatabaseService db1 = new DatabaseService("MySQL", "jdbc:mysql://localhost:3306/app");
        db1.init();   // @PostConstruct
        System.out.println("Bean ready! Using: " + db1 + "\n");

        DatabaseService db2 = db1;  // Same instance (singleton!)
        System.out.println("db1 == db2 (singleton)? " + (db1 == db2) + " ✅");

        // --- PROTOTYPE Scope ---
        System.out.println("\n--- Prototype Scope ---");
        NotificationService n1 = new NotificationService("Email");
        NotificationService n2 = new NotificationService("SMS");
        NotificationService n3 = new NotificationService("Push");
        System.out.println("n1 == n2 (prototype)? " + (n1 == n2) + " (different instances!)");
        System.out.println("Services: " + n1.getType() + ", " + n2.getType() + ", " + n3.getType());

        // --- Scope Comparison ---
        System.out.println("\n\n--- 📊 Scope Comparison ---");
        System.out.println("┌────────────┬──────────────────────────────┐");
        System.out.println("│ Scope      │ Behavior                     │");
        System.out.println("├────────────┼──────────────────────────────┤");
        System.out.println("│ singleton  │ One instance for entire app  │");
        System.out.println("│ prototype  │ New instance every time      │");
        System.out.println("│ request    │ One per HTTP request (web)   │");
        System.out.println("│ session    │ One per HTTP session (web)   │");
        System.out.println("└────────────┴──────────────────────────────┘");

        // --- Annotations Cheat Sheet ---
        System.out.println("\n--- 📋 Spring Annotations Cheat Sheet ---");
        Map<String, String> annotations = new LinkedHashMap<>();
        annotations.put("@Component", "Generic Spring bean");
        annotations.put("@Service", "Business logic layer");
        annotations.put("@Repository", "Data access layer");
        annotations.put("@Controller", "MVC Controller (returns views)");
        annotations.put("@RestController", "@Controller + @ResponseBody (returns JSON)");
        annotations.put("@Autowired", "Inject dependency automatically");
        annotations.put("@Qualifier", "Choose specific bean when multiple");
        annotations.put("@Bean", "Declare bean in @Configuration");
        annotations.put("@Scope(\"prototype\")", "New instance per injection");
        annotations.put("@PostConstruct", "Run after bean creation");
        annotations.put("@PreDestroy", "Run before bean destruction");

        annotations.forEach((k, v) -> System.out.printf("  %-28s → %s%n", k, v));

        // Simulate Container shutdown
        System.out.println("\n🏗️ Spring Container shutting down...");
        db1.destroy();  // @PreDestroy
        System.out.println("✅ Container closed gracefully.");
    }
}

// --- Simulated Bean with Lifecycle ---
class DatabaseService {
    private String dbType;
    private String url;
    private boolean connected = false;
    private static int instanceCount = 0;

    // Step 1: Constructor (Instantiation)
    public DatabaseService(String dbType, String url) {
        instanceCount++;
        this.dbType = dbType;
        this.url = url;
        System.out.println("  1️⃣ [Constructor] DatabaseService created (instance #" + instanceCount + ")");
        System.out.println("     DB Type: " + dbType);
        System.out.println("     URL: " + url);
    }

    // Step 2: @PostConstruct (Initialization)
    public void init() {
        System.out.println("  2️⃣ [@PostConstruct] Initializing connection pool...");
        this.connected = true;
        System.out.println("  3️⃣ [Ready] DatabaseService is ready to serve! ✅");
    }

    // Step 3: @PreDestroy (Cleanup)
    public void destroy() {
        System.out.println("  4️⃣ [@PreDestroy] Closing connection pool...");
        this.connected = false;
        System.out.println("  5️⃣ [Destroyed] DatabaseService shut down gracefully.");
    }

    @Override
    public String toString() {
        return "DatabaseService{" + dbType + ", connected=" + connected + "}";
    }
}

class NotificationService {
    private String type;

    public NotificationService(String type) {
        this.type = type;
        System.out.println("  📨 NotificationService created: " + type);
    }

    String getType() { return type; }

    void send(String message) {
        System.out.println("  📤 [" + type + "] Sending: " + message);
    }
}
