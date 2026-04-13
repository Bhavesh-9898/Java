import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Date_and_Time_API {

    public static void main(String[] args) {
        // The Date and Time API in Java 8 provides a new set of classes for handling date and time.
        // It is part of the java.time package and is based on the ISO calendar system.

        // The main classes in the Date and Time API are:
        // 1. LocalDate: Represents a date without time (e.g., 2024-06-01).
        // 2. LocalTime: Represents a time without date (e.g., 14:30:00).
        // 3. LocalDateTime: Represents a date and time (e.g., 2024-06-01T14:30:00).

        // Example usage of LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate);

        // Example usage of LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);

        // Example usage of LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + localDateTime);
        
    }
    
}
