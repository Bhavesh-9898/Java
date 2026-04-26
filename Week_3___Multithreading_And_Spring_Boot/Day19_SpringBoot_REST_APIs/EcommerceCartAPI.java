import java.util.*;

/**
 * Day 19 — Fun Example: E-commerce Cart API 🛒
 * 
 * Shows how REST APIs are structured with proper error handling.
 * Simulates: request validation, error responses, and ResponseEntity patterns.
 */
public class EcommerceCartAPI {

    static Map<Integer, Product> productCatalog = new LinkedHashMap<>();
    static Map<Integer, Integer> cart = new LinkedHashMap<>();  // productId → quantity
    static { 
        productCatalog.put(1, new Product(1, "iPhone 15", 79900, 10));
        productCatalog.put(2, new Product(2, "Samsung Galaxy S24", 69999, 5));
        productCatalog.put(3, new Product(3, "OnePlus 12", 49999, 0));  // Out of stock!
        productCatalog.put(4, new Product(4, "Pixel 8 Pro", 84999, 3));
    }

    public static void main(String[] args) {
        System.out.println("=== 🛒 E-commerce Cart API ===\n");

        // Browse products
        System.out.println("📱 Available Products:");
        System.out.println("─".repeat(60));
        productCatalog.values().forEach(p -> 
            System.out.printf("  ID:%d | %-20s | ₹%,d | Stock: %d %s%n",
                p.id, p.name, p.price, p.stock, p.stock == 0 ? "❌" : "✅"));
        System.out.println();

        // Add to cart — success
        addToCart(1, 2);   // 2x iPhone
        addToCart(2, 1);   // 1x Samsung

        // Add to cart — out of stock
        addToCart(3, 1);   // OnePlus — out of stock!

        // Add to cart — invalid product
        addToCart(99, 1);  // Product not found!

        // Add to cart — too many
        addToCart(4, 5);   // Only 3 in stock!

        // View cart
        viewCart();

        // Remove from cart
        removeFromCart(2);  // Remove Samsung

        // Checkout
        checkout();
    }

    static void addToCart(int productId, int quantity) {
        System.out.println("➕ POST /api/cart/add {productId:" + productId + ", qty:" + quantity + "}");
        
        Product product = productCatalog.get(productId);
        
        // Validation: product exists?
        if (product == null) {
            System.out.println("   ❌ 404: Product not found (id=" + productId + ")\n");
            return;
        }

        // Validation: in stock?
        if (product.stock == 0) {
            System.out.println("   ❌ 409: '" + product.name + "' is out of stock!\n");
            return;
        }

        // Validation: enough stock?
        if (quantity > product.stock) {
            System.out.println("   ❌ 400: Only " + product.stock + " units available for '" + product.name + "'\n");
            return;
        }

        cart.merge(productId, quantity, Integer::sum);
        System.out.println("   ✅ 200: Added " + quantity + "x " + product.name + " to cart\n");
    }

    static void removeFromCart(int productId) {
        System.out.println("🗑️ DELETE /api/cart/" + productId);
        
        if (!cart.containsKey(productId)) {
            System.out.println("   ❌ 404: Product not in cart\n");
            return;
        }

        String name = productCatalog.get(productId).name;
        cart.remove(productId);
        System.out.println("   ✅ 204: Removed " + name + " from cart\n");
    }

    static void viewCart() {
        System.out.println("🛒 GET /api/cart");
        System.out.println("   ✅ 200: Cart contents:");
        System.out.println("   " + "─".repeat(50));
        
        int total = 0;
        for (var entry : cart.entrySet()) {
            Product p = productCatalog.get(entry.getKey());
            int subtotal = p.price * entry.getValue();
            total += subtotal;
            System.out.printf("   %-20s × %d = ₹%,d%n", p.name, entry.getValue(), subtotal);
        }
        System.out.println("   " + "─".repeat(50));
        System.out.printf("   TOTAL: ₹%,d%n%n", total);
    }

    static void checkout() {
        System.out.println("💳 POST /api/cart/checkout");
        
        if (cart.isEmpty()) {
            System.out.println("   ❌ 400: Cart is empty!\n");
            return;
        }

        int total = 0;
        for (var entry : cart.entrySet()) {
            Product p = productCatalog.get(entry.getKey());
            total += p.price * entry.getValue();
            p.stock -= entry.getValue();  // Reduce stock
        }
        
        cart.clear();
        System.out.println("   ✅ 200: Order placed successfully!");
        System.out.printf("   💰 Total charged: ₹%,d%n", total);
        System.out.println("   📦 Your order is being prepared! 🎉\n");
    }
}

class Product {
    int id;
    String name;
    int price;
    int stock;

    Product(int id, String name, int price, int stock) {
        this.id = id; this.name = name; this.price = price; this.stock = stock;
    }
}
