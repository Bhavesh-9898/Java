public class Fail_Safe_Iterator {
    public static void main(String[] args) {
        // A fail-safe iterator is an iterator that does not throw a ConcurrentModificationException when the underlying collection is modified while the iterator is in use. 
        // Instead, it allows the modification to occur and continues to iterate over the collection without throwing an exception. 
        // Fail-safe iterators are typically used in collections that are designed to be thread-safe, such as CopyOnWriteArrayList and ConcurrentHashMap. 
        // These collections use a copy-on-write mechanism or other strategies to ensure that modifications do not affect the iteration process.

        java.util.concurrent.CopyOnWriteArrayList<String> list = new java.util.concurrent.CopyOnWriteArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        java.util.Iterator<String> iterator = list.iterator();

        // Modifying the collection while iterating will not cause a ConcurrentModificationException
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
            if (item.equals("Two")) {
                list.remove(item); // This will not cause a ConcurrentModificationException
            }
        }
    }
    
}
