public class Do_While_Loop {
    public static void main(String[] args) {
        // Do-while loop is similar to a while loop, but it guarantees that the block of code will be executed at least once, 
        // even if the condition is false. 
        // It consists of a block of code to be executed and a condition to be checked after the execution of the block.
        // The syntax of a do-while loop is:

        // Using a do-while loop to print numbers from 1 to 5
        int i = 1; // initialization
        do {
            System.out.println(i);
            i++; // increment
        } while (i <= 5); // condition
    }
    
}
