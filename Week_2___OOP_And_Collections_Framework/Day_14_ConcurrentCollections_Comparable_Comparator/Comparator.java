package Week_2___OOP_And_Collections_Framework.Day_14_ConcurrentCollections_Comparable_Comparator;

public class Comparator {
    public static void main(String[] args) {
        // The Comparator interface in Java is used to define an external ordering of objects. 
        // It provides a single method, compare(), which compares two objects of the same type and returns an integer value based on the comparison.
        // The compare() method returns:
        // - A negative integer if the first object is less than the second object.
        // - Zero if the first object is equal to the second object.
        // - A positive integer if the first object is greater than the second object.

        // Example usage of Comparator interface:
        java.util.List<String> names = new java.util.ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Sorting the list using a custom comparator that sorts in reverse order
        java.util.Collections.sort(names, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Reverse order
            }
        });

        System.out.println("Sorted names in reverse order: " + names);
    }
	
}
