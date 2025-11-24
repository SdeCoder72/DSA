package LinkedList;

public class MergeTwoSortedLL {
    public static Node insert(Node head1, Node head2) {
        Node l1 = head1;
        Node l2 = head2;
        Node k = new Node(-1);
        Node d = k;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                k.next = l1;
                l1  = l1.next;
            }
            else {
                k.next = l2;
                l2 = l2.next;
            }
            k = k.next;
        }
        if(l1 != null) k.next = l2;
        else k.next = l1;
        return d.next;
    }
    public static void main(String[] args) {

    }
}
