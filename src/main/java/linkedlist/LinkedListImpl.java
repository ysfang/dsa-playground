package linkedlist;

public class LinkedListImpl {
    static Node head;

    public static void main(String[] args) {
        LinkedListImpl li = new LinkedListImpl();
        li.head = new Node(1);
        li.head.next = new Node(2);
        li.head.next.next = new Node(3);
        li.head.next.next.next = new Node(4);

        li.printList();
        li.reverse();
        li.printList();
    }

    static void reverse() {
        Node temp = null;
        Node current = head;
        Node rest = null;
        while (current != null) {
            rest = current.next;
            current.next = temp;
            temp = current;
            current = rest;
        }
        head = temp;
    }

    static void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
