import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        String dayName;
        
        // Switch statement is a control flow statement that allows you to execute different blocks of code based on the value of a variable.
        // It is often used as an alternative to a series of if-else statements when you have multiple conditions to check against a single variable.
        // The switch statement evaluates the expression (in this case, the variable 'day') and compares it against the values specified in the case labels.
        // Using switch statement to determine the name of the day based on the day number
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number";
        }

        System.out.println("The day is: " + dayName);
    }
    
}
