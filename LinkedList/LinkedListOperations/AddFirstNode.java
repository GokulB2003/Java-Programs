import java.util.*;

class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addNodeFirst(int data) {
        // create a new node
        Node newNode = new Node(data);

        // if LinkedList is empty..
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = newNode;
        newNode.next = null;

    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        // if LinkedList is not Empty.
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    
    public static void add(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addNodeFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void printLinkedList() {
        // create a temp reference which point to head
        Node temp = head;
        while (temp != null) {// retriew the whole linkedList.
            System.out.print(temp.data + " ");// print the data of LinkedList.
            temp = temp.next;// move -->
        }
        System.out.println();
    }
}

public class AddFirstNode {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addNodeFirst(10);
        ll.addLast(15);
        ll.add(2, 200);
        ll.add(1, 100);
        ll.printLinkedList();

    }
}