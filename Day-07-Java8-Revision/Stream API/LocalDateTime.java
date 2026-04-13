public class LocalDateTime {
    public static void main(String[] args) {
        // The LocalDateTime class in Java 8 is used to represent a date and time without a time zone (e.g., 2024-06-01T14:30:00).
        // It is part of the java.time package.

        // Example usage of LocalDateTime
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + currentDateTime);
    }
    
}
