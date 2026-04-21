package Week_2___OOP_And_Collections_Framework.Day_14_ConcurrentCollections_Comparable_Comparator;

public class Comparable {
    public static void main(String[] args) {
        // The Comparable interface in Java is used to define the natural ordering of objects. 
        // It provides a single method, compareTo(), which compares the current object with another object of the same type and returns an integer value based on the comparison.
        // The compareTo() method returns:
        // - A negative integer if the current object is less than the specified object.
        // - Zero if the current object is equal to the specified object.
        // - A positive integer if the current object is greater than the specified object.

        // Example usage of Comparable interface:
        java.util.List<String> names = new java.util.ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Sorting the list using natural ordering defined by Comparable
        java.util.Collections.sort(names);

        System.out.println("Sorted names: " + names);
    }
    
}
