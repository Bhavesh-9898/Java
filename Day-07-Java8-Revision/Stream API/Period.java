public class Period {
    public static void main(String[] args) {
        // The Period class in Java 8 is used to represent a period of time in terms of years, months, and days.
        // It is part of the java.time package.

        // Example usage of Period
        java.time.Period period = java.time.Period.of(1, 2, 15); // 1 year, 2 months, and 15 days
        System.out.println("Period: " + period);
    }
    
}
