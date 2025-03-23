// File: Linkedlist.java
public class Linkedlist {

    // Private static inner class for Node
    private static class Node {
        private final int data; // Final field
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null; // Head of the linked list

    // 1. Insert a node at the beginning
    public void insertAtBeginning(int data) {
        System.out.println("Adding a node at the beginning of the list with data " + data);

        Node newNode = new Node(data);
        newNode.next = this.head; // Works even if head is null
        this.head = newNode;
    }

    // 2. Insert a node at the end
    public void insertAtEnd(int data) {
        System.out.println("Adding a node at the end of the list with data " + data);

        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // 3. Delete a node from the beginning
    public void deleteFromBeginning() {
        System.out.println("Deleting a node from the beginning of the list");

        if (this.head == null) {
            System.out.println("The list is empty. Nothing to delete.");
        } else {
            this.head = this.head.next;
        }
    }

    // Display the list
    public void displayList() {
        if (this.head == null) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The elements of the List are:");
            Node current = this.head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        // Create a new linked list
        Linkedlist list = new Linkedlist();

        // Display the list before any operations
        System.out.println("Initial list:");
        list.displayList();
        System.out.println();

        // Insert nodes at the beginning
        list.insertAtBeginning(1);
        list.displayList();
        System.out.println();

        list.insertAtBeginning(2);
        list.displayList();
        System.out.println();

        // Insert nodes at the end
        list.insertAtEnd(8);
        list.displayList();
        System.out.println();

        list.insertAtEnd(9);
        list.displayList();
        System.out.println();

        // Delete a node from the beginning
        list.deleteFromBeginning();
        list.displayList();
        System.out.println();
    }
}