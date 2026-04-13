public class LocalTime {
    public static void main(String[] args) {
        // The LocalTime class in Java 8 is used to represent a time (e.g., 14:30:00).
        // It is part of the java.time package.

        // Example usage of LocalTime
        java.time.LocalTime currentTime = java.time.LocalTime.now();
        System.out.println("Current LocalTime: " + currentTime);
    }
}
