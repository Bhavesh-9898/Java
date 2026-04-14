public class Break {
    public static void main(String[] args) {
        // The break statement is used to exit a loop or switch statement prematurely. 
        // When a break statement is encountered inside a loop, the loop is immediately terminated, and the program continues with the next statement after the loop.

        // Using break in a for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }
    }
    
}
