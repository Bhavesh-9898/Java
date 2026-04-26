/**
 * Day 18 — Fun Example: Coffee Shop ☕ (IoC & DI without Spring)
 * 
 * This demonstrates IoC and Dependency Injection concepts using plain Java!
 * No Spring framework needed — just understanding the CONCEPT.
 * 
 * WITHOUT DI: CoffeeShop creates its own dependencies (tightly coupled)
 * WITH DI:    CoffeeShop receives dependencies from outside (loosely coupled)
 */
public class CoffeeShopDI {

    public static void main(String[] args) {
        System.out.println("=== ☕ Coffee Shop — IoC & DI Demo ===\n");

        // ==========================================
        // ❌ WITHOUT Dependency Injection (Tight Coupling)
        // ==========================================
        System.out.println("--- ❌ WITHOUT DI (Tight Coupling) ---\n");

        TightCoupledShop oldShop = new TightCoupledShop();
        oldShop.prepareOrder("Latte");
        // Problem: Can't change bean supplier or payment method without modifying class!
        // Problem: Can't test with mock dependencies!

        // ==========================================
        // ✅ WITH Dependency Injection (Loose Coupling)
        // ==========================================
        System.out.println("\n--- ✅ WITH DI (Loose Coupling) ---\n");

        // We "inject" dependencies from outside (like Spring Container does!)
        BeanSupplier indianBeans = new IndianBeanSupplier();
        BeanSupplier colombianBeans = new ColombianBeanSupplier();
        PaymentProcessor upiPayment = new UPIPayment();
        PaymentProcessor cardPayment = new CardPayment();

        // Shop 1: Indian beans + UPI payment
        LooseCoupledShop shop1 = new LooseCoupledShop(indianBeans, upiPayment);
        System.out.println("🏪 Shop 1 (Indian Beans + UPI):");
        shop1.prepareAndPay("Cappuccino", 200);

        // Shop 2: Colombian beans + Card payment — just swap the dependencies!
        LooseCoupledShop shop2 = new LooseCoupledShop(colombianBeans, cardPayment);
        System.out.println("\n🏪 Shop 2 (Colombian Beans + Card):");
        shop2.prepareAndPay("Espresso", 300);

        // ==========================================
        // 🏗️ DIY Spring Container (simplified simulation)
        // ==========================================
        System.out.println("\n\n--- 🏗️ Simulated Spring Container ---\n");

        // This is what Spring does behind the scenes!
        SimpleContainer container = new SimpleContainer();

        // Register beans (like @Component or @Bean)
        container.register("beanSupplier", new ColombianBeanSupplier());
        container.register("paymentProcessor", new UPIPayment());
        container.register("coffeeShop", new LooseCoupledShop(
            (BeanSupplier) container.getBean("beanSupplier"),
            (PaymentProcessor) container.getBean("paymentProcessor")
        ));

        // Use the beans
        LooseCoupledShop managedShop = (LooseCoupledShop) container.getBean("coffeeShop");
        managedShop.prepareAndPay("Mocha", 350);

        System.out.println("\nRegistered beans: " + container.listBeans());
        
        // Singleton check
        Object bean1 = container.getBean("coffeeShop");
        Object bean2 = container.getBean("coffeeShop");
        System.out.println("Same instance (singleton)? " + (bean1 == bean2) + " ✅");
    }
}

// ==========================================
// INTERFACES (Abstraction)
// ==========================================
interface BeanSupplier {
    String getBeans();
    String getOrigin();
}

interface PaymentProcessor {
    boolean processPayment(int amount);
}

// ==========================================
// IMPLEMENTATIONS
// ==========================================
class IndianBeanSupplier implements BeanSupplier {
    public String getBeans() { return "☕ Premium Coorg Arabica beans"; }
    public String getOrigin() { return "India 🇮🇳"; }
}

class ColombianBeanSupplier implements BeanSupplier {
    public String getBeans() { return "☕ Single-origin Colombian beans"; }
    public String getOrigin() { return "Colombia 🇨🇴"; }
}

class UPIPayment implements PaymentProcessor {
    public boolean processPayment(int amount) {
        System.out.println("  💳 UPI Payment: ₹" + amount + " — Success! ✅");
        return true;
    }
}

class CardPayment implements PaymentProcessor {
    public boolean processPayment(int amount) {
        System.out.println("  💳 Card Payment: ₹" + amount + " — Authorized! ✅");
        return true;
    }
}

// ==========================================
// ❌ TIGHT COUPLING (Without DI)
// ==========================================
class TightCoupledShop {
    // Directly creates dependencies — can't change without modifying code!
    private IndianBeanSupplier supplier = new IndianBeanSupplier();  // Hardcoded!

    void prepareOrder(String coffee) {
        System.out.println("  Making " + coffee + " with " + supplier.getBeans());
        System.out.println("  ⚠️ Problem: Can't switch to Colombian beans without changing code!");
    }
}

// ==========================================
// ✅ LOOSE COUPLING (With DI)
// ==========================================
class LooseCoupledShop {
    // Depends on INTERFACES, not concrete classes
    private final BeanSupplier beanSupplier;       // Injected!
    private final PaymentProcessor paymentProcessor; // Injected!

    // Constructor Injection (Spring's recommended approach!)
    public LooseCoupledShop(BeanSupplier beanSupplier, PaymentProcessor paymentProcessor) {
        this.beanSupplier = beanSupplier;
        this.paymentProcessor = paymentProcessor;
    }

    void prepareAndPay(String coffee, int price) {
        System.out.println("  ☕ Making " + coffee + "...");
        System.out.println("  📦 Using: " + beanSupplier.getBeans() + " from " + beanSupplier.getOrigin());
        paymentProcessor.processPayment(price);
    }
}

// ==========================================
// 🏗️ SIMPLE DIY CONTAINER (Like Spring's ApplicationContext)
// ==========================================
class SimpleContainer {
    private java.util.Map<String, Object> beans = new java.util.HashMap<>();

    // Register a bean (like @Component / @Bean)
    void register(String name, Object bean) {
        beans.put(name, bean);
        System.out.println("  📦 Registered bean: '" + name + "' → " + bean.getClass().getSimpleName());
    }

    // Get a bean (like @Autowired / context.getBean())
    Object getBean(String name) {
        Object bean = beans.get(name);
        if (bean == null) throw new RuntimeException("Bean '" + name + "' not found!");
        return bean;
    }

    java.util.Set<String> listBeans() { return beans.keySet(); }
}
