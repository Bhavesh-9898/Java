public class Common_String_Operations {
    String str = "Hello, World!";
    //Info about the string    int length = str.length(); // Length of the string
    char firstChar = str.charAt(0); // First character
    String substring = str.substring(0, 5); // Substring "Hello"    
    String upperCase = str.toUpperCase(); // Convert to uppercase
    String lowerCase = str.toLowerCase(); // Convert to lowercase
    boolean containsWorld = str.contains("World"); // Check if it contains "World"
    int indexOfWorld = str.indexOf("World"); // Find the index of "World"
    String replaced = str.replace("World", "Java"); // Replace "World" with "Java"
    String trimmed = str.trim(); // Remove leading and trailing whitespace
    String[] words = str.split(","); // Split the string by comma
    int wordCount = words.length; // Count the number of words
    String joined = String.join(" ", words); // Join the words with a space
    
    
}
