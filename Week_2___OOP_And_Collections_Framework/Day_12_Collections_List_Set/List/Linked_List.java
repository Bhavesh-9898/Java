public class Linked_List {
    // A Linked List is a linear data structure where each element (called a node) contains a reference to the next node in the sequence.
        // It allows for efficient insertion and deletion of elements, as it does not require shifting elements like an array.
        // Each node typically contains two parts: the data and a reference (or pointer) to the next node in the list.
        // The first node is called the head, and the last node is called the tail, which points to null.
        // Linked Lists can be singly linked (where each node points to the next node) or doubly linked (where each node points to both the next and previous nodes).
    public static void main(String[] args) {
        // Example of using a Linked List
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        System.out.println("Linked List: " + linkedList);
    }
    
}
