package Week_3___Multithreading_And_Spring_Boot.Day_21_Microservices_Concepts;

import java.util.*;

/**
 * Day 21 — Fun Example: Microservices Architecture Simulator 🏗️
 * 
 * Simulates a microservices-based food ordering system:
 *   - User Service (authentication)
 *   - Restaurant Service (menu)
 *   - Order Service (place orders)
 *   - Payment Service (process payments)
 *   - API Gateway (routes requests)
 * 
 * Shows: Service communication, API Gateway, Circuit Breaker pattern
 */
public class MicroservicesSimulator {

    public static void main(String[] args) {
        System.out.println("=== 🏗️ Microservices Architecture Simulator ===");
        System.out.println("  Food Ordering Platform (like Zomato/Swiggy)\n");

        // --- Initialize all microservices ---
        UserService userService = new UserService();
        RestaurantService restaurantService = new RestaurantService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        APIGateway gateway = new APIGateway(userService, restaurantService, orderService, paymentService);

        // --- Simulate User Journey ---
        System.out.println("━".repeat(60));
        System.out.println("🧑 Customer Journey: Ordering food online");
        System.out.println("━".repeat(60));

        // Step 1: Login through API Gateway
        System.out.println("\n📌 Step 1: Login");
        String token = gateway.route("POST", "/auth/login", Map.of("email", "rahul@email.com", "password", "pass123"));
        System.out.println("   Result: " + token);

        // Step 2: Browse restaurants
        System.out.println("\n📌 Step 2: Browse Menu");
        String menu = gateway.route("GET", "/restaurants/menu", Map.of("restaurantId", "1"));
        System.out.println("   Result: " + menu);

        // Step 3: Place order
        System.out.println("\n📌 Step 3: Place Order");
        String order = gateway.route("POST", "/orders/create", 
            Map.of("userId", "1", "restaurantId", "1", "items", "Butter Chicken, Naan", "total", "650"));
        System.out.println("   Result: " + order);

        // Step 4: Make payment
        System.out.println("\n📌 Step 4: Payment");
        String payment = gateway.route("POST", "/payments/process", 
            Map.of("orderId", "ORD-1001", "amount", "650", "method", "UPI"));
        System.out.println("   Result: " + payment);

        // --- Circuit Breaker Demo ---
        System.out.println("\n\n" + "━".repeat(60));
        System.out.println("⚡ Circuit Breaker Demo");
        System.out.println("━".repeat(60));

        System.out.println("\n📌 Payment service goes DOWN...");
        paymentService.setAvailable(false);

        System.out.println("   Attempt 1:");
        gateway.route("POST", "/payments/process", Map.of("orderId", "ORD-1002", "amount", "450", "method", "Card"));
        System.out.println("   Attempt 2:");
        gateway.route("POST", "/payments/process", Map.of("orderId", "ORD-1003", "amount", "320", "method", "UPI"));
        System.out.println("   Attempt 3:");
        gateway.route("POST", "/payments/process", Map.of("orderId", "ORD-1004", "amount", "550", "method", "Card"));

        System.out.println("\n   Circuit Breaker opened! Using fallback...");
        System.out.println("   Attempt 4 (fallback):");
        gateway.route("POST", "/payments/process", Map.of("orderId", "ORD-1005", "amount", "200", "method", "UPI"));

        System.out.println("\n📌 Payment service recovered!");
        paymentService.setAvailable(true);
        gateway.resetCircuitBreaker();
        System.out.println("   Attempt 5 (recovered):");
        gateway.route("POST", "/payments/process", Map.of("orderId", "ORD-1006", "amount", "750", "method", "UPI"));

        // Architecture diagram
        System.out.println("\n\n" + "━".repeat(60));
        System.out.println("📊 Architecture Overview");
        System.out.println("━".repeat(60));
        System.out.println();
        System.out.println("  Client App (Mobile/Web)");
        System.out.println("       │");
        System.out.println("       ▼");
        System.out.println("  ┌─────────────────┐");
        System.out.println("  │   API Gateway    │ ← Auth, Routing, Rate Limiting");
        System.out.println("  └────────┬────────┘");
        System.out.println("       ┌───┼───┬───────┐");
        System.out.println("       ▼   ▼   ▼       ▼");
        System.out.println("  ┌──────┐┌──────┐┌──────┐┌──────┐");
        System.out.println("  │ User ││ Rest ││Order ││ Pay  │");
        System.out.println("  │ Svc  ││ Svc  ││ Svc  ││ Svc  │");
        System.out.println("  │:8081 ││:8082 ││:8083 ││:8084 │");
        System.out.println("  └──┬───┘└──┬───┘└──┬───┘└──┬───┘");
        System.out.println("     │       │       │       │");
        System.out.println("  ┌──┴──┐ ┌──┴──┐ ┌──┴──┐ ┌──┴──┐");
        System.out.println("  │Users│││Menus││Orders│ │Txns │");
        System.out.println("  │ DB  │││ DB  ││  DB  │ │ DB  │");
        System.out.println("  └─────┘ └─────┘ └─────┘ └─────┘");
    }
}

// === MICROSERVICES ===

class UserService {
    Map<String, String> users = Map.of("rahul@email.com", "Rahul Sharma", "priya@email.com", "Priya Patel");

    String login(String email, String password) {
        System.out.println("     [UserService:8081] Authenticating " + email);
        if (users.containsKey(email)) {
            String token = "JWT-" + UUID.randomUUID().toString().substring(0, 8);
            return "✅ Welcome " + users.get(email) + "! Token: " + token;
        }
        return "❌ Invalid credentials";
    }
}

class RestaurantService {
    String getMenu(String restaurantId) {
        System.out.println("     [RestaurantService:8082] Fetching menu for restaurant #" + restaurantId);
        return "🍽️ Menu: Butter Chicken ₹350, Dal Makhani ₹250, Naan ₹60, Biryani ₹300";
    }
}

class OrderService {
    private int orderSeq = 1000;

    String createOrder(String userId, String items, String total) {
        String orderId = "ORD-" + (++orderSeq);
        System.out.println("     [OrderService:8083] Creating order " + orderId + " for user #" + userId);
        return "📦 Order " + orderId + " created! Items: " + items + " | Total: ₹" + total;
    }
}

class PaymentService {
    private boolean available = true;

    void setAvailable(boolean available) { this.available = available; }
    boolean isAvailable() { return available; }

    String processPayment(String orderId, String amount, String method) {
        if (!available) {
            throw new RuntimeException("Payment service unavailable!");
        }
        System.out.println("     [PaymentService:8084] Processing ₹" + amount + " via " + method);
        return "💳 Payment of ₹" + amount + " for " + orderId + " — Success! ✅";
    }
}

// === API GATEWAY (Routes + Circuit Breaker) ===

class APIGateway {
    private UserService userService;
    private RestaurantService restaurantService;
    private OrderService orderService;
    private PaymentService paymentService;
    private int failureCount = 0;
    private static final int FAILURE_THRESHOLD = 3;

    APIGateway(UserService u, RestaurantService r, OrderService o, PaymentService p) {
        this.userService = u; this.restaurantService = r;
        this.orderService = o; this.paymentService = p;
    }

    String route(String method, String path, Map<String, String> params) {
        System.out.println("   🌐 [Gateway] " + method + " " + path);

        try {
            if (path.equals("/auth/login")) {
                return userService.login(params.get("email"), params.get("password"));
            } else if (path.equals("/restaurants/menu")) {
                return restaurantService.getMenu(params.get("restaurantId"));
            } else if (path.equals("/orders/create")) {
                return orderService.createOrder(params.get("userId"), params.get("items"), params.get("total"));
            } else if (path.equals("/payments/process")) {
                // Circuit Breaker pattern
                if (failureCount >= FAILURE_THRESHOLD) {
                    return paymentFallback(params);
                }
                String result = paymentService.processPayment(params.get("orderId"), params.get("amount"), params.get("method"));
                failureCount = 0;
                return result;
            }
            return "❌ 404: Route not found: " + path;
        } catch (Exception e) {
            failureCount++;
            System.out.println("     ⚠️ Service failed! (failure " + failureCount + "/" + FAILURE_THRESHOLD + ")");
            return "❌ " + e.getMessage();
        }
    }

    String paymentFallback(Map<String, String> params) {
        System.out.println("     🔄 [Circuit Breaker OPEN] Using fallback!");
        return "⏳ Payment queued for later processing. Order " + params.get("orderId") + " saved.";
    }

    void resetCircuitBreaker() {
        failureCount = 0;
        System.out.println("   🔄 Circuit Breaker RESET (CLOSED state)");
    }
}
