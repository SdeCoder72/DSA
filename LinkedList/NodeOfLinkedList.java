package LinkedList;

import java.util.Scanner;


public class NodeOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10, 20, 30, 40
        System.out.print("Enter value: ");
        Node a = new Node(sc.nextInt());  // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        System.out.println(a.next);

        //connecting

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);

    }
}
