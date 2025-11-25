package LinkedList;

public class CircularLLTraversal {
    void printList(Node head) {
        // Your code here
        Node t = head;
        while(t.next != head) {
            System.out.print(t.val + " ");
            t = t.next;
        }
        System.out.print(t.val);
    }
    public static void main(String[] args) {

    }
}
