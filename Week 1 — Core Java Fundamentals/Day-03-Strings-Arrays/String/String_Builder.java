public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // StringBuilder is mutable, so we can modify the string without creating a new object
        sb.append(" World");
        String result = sb.toString(); // Convert StringBuilder to String
        System.out.println(result); // Output: Hello World
        
    }
}
