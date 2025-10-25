package LinkedList;

import java.util.Scanner;

public class DisplayLinkedList {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static void displayRec(Node a) {
        if(a == null) return;
        System.out.print(a.val + " ");
        displayRec(a.next);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter value: ");
        Node a = new Node(sc.nextInt());  // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        displayRec(a);
        System.out.println();
        System.out.println(get(a, 2));

//        Node n = null;
//        n.val = 15;  // ERROR
//        System.out.println(n.val+ " " + n.next);  //ERROR

    }

    // 0 based indexing
    private static int get(Node head, int idx) {
        Node temp = head;
        int i = 0;
        while(i < idx) {
            temp = temp.next;
            i++;
        }
        return temp.val;

    }

}
