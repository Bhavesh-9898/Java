public class Nested_try_catch {
    
    // Nested try-catch blocks are try-catch blocks that are placed inside another try-catch block. 
    // This allows for more granular handling of exceptions, where you can catch specific exceptions in the inner try-catch block while still allowing for a broader catch in the outer block.

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            try {
                String str = null;
                System.out.println(str.length()); // This will throw a NullPointerException
            } catch (NullPointerException ex) {
                System.out.println("Caught NullPointerException: " + ex.getMessage());
            }
        }
    }
    
}
