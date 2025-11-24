package LinkedList;

public class ReverseASublistOfALinkedList {
    public static void reverse(Node head) {
        Node p = null;
        Node f = null;
        Node c = head;
        while(c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
    }
    public static Node reverseBetween(int l, int r, Node head) {
        Node d = new Node(-1);
        d.next = head;
        Node temp = d;
        for(int i = 1; i<l; i++) {
            temp = temp.next;
        }
        Node tail1 = temp;
        Node head2 = temp.next;
        for(int i = l; i<=r; i++) {
            temp = temp.next;
        }
        Node tail2 = temp;
        Node head3 = temp.next;
        tail1.next = null;
        tail2.next = null;
        reverse(head2);
        tail1.next = tail2;
        head2.next = head3;
        return d.next;
    }
    public static void main(String[] args) {

    }
}
