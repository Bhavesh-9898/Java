public class Fail_Fast_Iterator {
    public static void main(String[] args) {
        // A fail-fast iterator is an iterator that throws a ConcurrentModificationException if the underlying collection is modified while the iterator is in use. 
        // This behavior is designed to prevent concurrent modifications to the collection, which can lead to unpredictable behavior and data corruption.
        // Fail-fast iterators are typically used in collections that are not thread-safe, such as ArrayList and HashMap. 
        // When a fail-fast iterator detects that the collection has been modified after the iterator was created, it will throw a ConcurrentModificationException to indicate that the operation is not allowed.

        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        java.util.Iterator<String> iterator = list.iterator();

        // Modifying the collection while iterating will cause a ConcurrentModificationException
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
            if (item.equals("Two")) {
                list.remove(item); // This will cause a ConcurrentModificationException
            }
        }
    }
    
}
