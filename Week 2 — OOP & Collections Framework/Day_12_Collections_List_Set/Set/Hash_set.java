public class Hash_set {
    // A Hash Set is a collection that implements the Set interface and is backed by a hash table.
        // It does not allow duplicate elements and does not maintain any order of the elements.
        // Hash Sets provide constant-time performance for basic operations like add, remove, and contains, assuming the hash function disperses elements properly.
        // The elements in a Hash Set are stored in buckets based on their hash code, which allows for efficient retrieval.
        // Hash Sets are part of the java.util package and are commonly used when you want to store unique elements without caring about the order.
    public static void main(String[] args) {
        // Example of using a Hash Set
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        hashSet.add("First");
        hashSet.add("Second");
        hashSet.add("Third");
        hashSet.add("First"); // Duplicate element will not be added
        System.out.println("Hash Set: " + hashSet);
    }
    
}
