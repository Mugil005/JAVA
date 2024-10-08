import java.util.*;
class Node {
    int data;
    int key;
    Node next;
}
public class main {
    static Node head = null;
    static Node current = null;
    static boolean isEmpty() {
        return head == null;
    }
    static void insertFirst(int key, int data) {
        Node link = new Node();
        link.key = key;
        link.data = data;
        if (isEmpty()) {
            head = link;
            head.next = head;
        } else {
            link.next = head;
            head = link;
        }
    }
    static void printList() {
        Node ptr = head;
        System.out.print("\n[ ");
        if (head != null) {
            while (ptr.next != ptr) {
                System.out.print("(" + ptr.key + "," + ptr.data + ") ");
                ptr = ptr.next;
            }
        }
        System.out.print(" ]");
    }
    public static void main(String[] args) {
        insertFirst(1, 10);
        insertFirst(2, 20);
        insertFirst(3, 30);
        insertFirst(4, 1);
        insertFirst(5, 40);
        insertFirst(6, 56);
        System.out.print("Circular Linked List: ");
        printList();
    }
}