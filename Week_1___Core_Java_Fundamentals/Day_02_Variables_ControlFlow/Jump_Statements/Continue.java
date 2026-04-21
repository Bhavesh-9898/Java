public class Continue {
    public static void main(String[] args) {
        // The continue statement is used to skip the current iteration of a loop and move to the next iteration. 
        // When a continue statement is encountered inside a loop, the remaining code in the current iteration is skipped, and the loop proceeds to the next iteration.

        // Using continue in a for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the rest of the code in this iteration
            }
            System.out.println(i);
        }
    }
}
