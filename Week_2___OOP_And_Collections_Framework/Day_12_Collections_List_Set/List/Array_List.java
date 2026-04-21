public class Array_List {
    // An Array List is a resizable array implementation of the List interface in Java.
        // It allows for dynamic resizing, meaning that it can grow or shrink as needed to accommodate the number of elements.
        // Array Lists provide fast random access to elements, as they are stored in contiguous memory locations.
        // However, inserting or deleting elements from the middle of an Array List can be inefficient, as it may require shifting elements to maintain the order.
        // Array Lists are part of the java.util package and are commonly used for storing and manipulating collections of objects.
    public static void main(String[] args) {
        // Example of using an Array List
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        System.out.println("Array List: " + arrayList);
    }
    
}