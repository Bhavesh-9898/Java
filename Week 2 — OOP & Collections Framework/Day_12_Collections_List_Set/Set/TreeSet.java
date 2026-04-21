public class TreeSet {
    // A TreeSet is a sorted set implementation of the Set interface in Java.
        // It uses a Red-Black tree data structure to store elements in a sorted order.
        // TreeSets do not allow duplicate elements and automatically sort the elements in natural order (or according to a specified comparator).
        // The TreeSet class provides methods for basic operations like adding, removing, and checking for the presence of elements, as well as methods for navigating the sorted set (e.g., first(), last(), higher(), lower()).
        // TreeSets are part of the java.util package and are commonly used when a sorted collection of unique elements is required.
    public static void main(String[] args) {
        // Example of using a TreeSet
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("Tree Set: " + treeSet);
    }
    
}
