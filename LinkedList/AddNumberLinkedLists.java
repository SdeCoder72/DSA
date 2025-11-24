package LinkedList;

public class AddNumberLinkedLists {
    public Node reverse(Node head) {
        Node p = null;
        Node f = null;
        Node c = head;
        while(c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node t1 = reverse(head1);
        Node t2 = reverse(head2);
        Node d = new Node(-1);
        Node t = d;
        int sum = 0;
        int count = 0;
        while(t1 != null || t2 != null) {
            if(t1 == null) sum = t2.val + count;
            else if(t2 == null) sum = t1.val + count;
            else sum = t1.val + t2.val + count;

            Node current = new Node(sum%10);
            t.next = current;
            if(sum > 9) count = 1;
            else count = 0;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
            t = t.next;
        }
        if(sum != 0 && count == 1) {
            Node c = new Node(1);
            t.next = c;
        }
        d = d.next;
        d = reverse(d);
        while(d.val == 0) d = d.next;

        return d;

    }
    public static void main(String[] args) {

    }
}
