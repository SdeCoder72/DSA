package LinkedList;

public class MergeSortInLL {
    public static void merge(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node k = new Node(-1);
        Node d = k;
        while(i != null && j != null) {

        }
    }
    public static void mergeSort(Node root) {
        // split the root (Using slow fast pointer)
        Node slow = root;
        Node fast = root;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        mergeSort(root);
        mergeSort(head2);
        merge(root, head2);


    }
    public static void main(String[] args) {

    }
}
