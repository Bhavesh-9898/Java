import java.time.Duration;

public class DurationExample {
    
    public static void main(String[] args) {
        // The Duration class in Java 8 is used to represent a time-based amount of time, such as '30 seconds' or '2 hours'.
        // It is part of the java.time package.

        // Example usage of Duration
        Duration duration = Duration.ofSeconds(30);
        System.out.println("Duration: " + duration);

        Duration duration2 = Duration.ofHours(2);
        System.out.println("Duration: " + duration2);
    }
}
