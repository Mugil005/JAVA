

import java.util.Scanner;

public class operation2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    operation2() {
        head = null;
    }

    public void insertend(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void decensort() {
        Node current, index;
        int temp;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data < index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    public void ascensort() {
        Node current, index;
        int temp;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }
    public void dup() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        operation2 list = new operation2();
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        System.out.println("Enter  values");
        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            list.insertend(val);
        }
        list.display();
        System.out.println("Linked list in Decending order:");
        list.decensort();
        list.display();
        System.out.println("Linked list in Ascending order:");
        list.ascensort();
        list.display();
        System.out.println("Linked list Duplicate element removal(trimmimg):");
        list.dup();
        list.display();
        s.close();
    }
}