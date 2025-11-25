package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    // constructor
    ListNode(int val) {
        this.val = val;
    }
}
class DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    ListNode deleteAtHead() {
        if(head == null) {
            throw new RuntimeException("List is Empty");
        }
        ListNode temp = head;
        if(size == 1) {
            head = tail = null;
            size--;
            return temp;
        }
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }
    ListNode deleteAtTail() {
        if(tail == null) {
            throw new RuntimeException("List is Empty");
        }
        ListNode temp = tail;
        if(size == 1) {
            head = tail = null;
            size--;
            return temp;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return temp;
    }
    void insert(int idx, int val) {
        if(idx <= 0 || idx > size+1 ) throw new IndexOutOfBoundsException();
        ListNode temp = new ListNode(val);
        ListNode t = head;
        if(idx == 1) {
            insertAtHead(val);
        }
        else if(idx == size+1) {
            insertAtTail(val);
        }
        else {
            for(int i = 1; i<idx-1;i++) {
                t = t.next;
            }
            ListNode a = t.next;
            t.next = temp;
            temp.prev = t;
            temp.next = a;
            a.prev = temp;
            size++;
        }
    }
    void delete(int idx){
        if(idx <= 0 || idx > size) throw new IndexOutOfBoundsException();
        if(idx == 1) deleteAtHead();
        else if(idx == size) deleteAtTail();
        else {
            ListNode temp = head;
            for(int i = 1; i<idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next != null) temp.next.prev = temp;
            size--;
        }
    }
    void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse() {
        ListNode temp = tail;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    int size() {
        return size;
    }
}
public class DoublyLinkedLIstClass {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.insertAtHead(10);
        d.insertAtHead(5);
        d.insertAtHead(20);
        d.insertAtHead(30);
        d.insertAtTail(50);
        d.insertAtTail(60);
        d.insertAtTail(70);
        d.display();
        d.displayReverse();

        d.deleteAtHead();
        d.deleteAtHead();
        d.deleteAtHead();

        d.display();
        d.displayReverse();

        d.deleteAtTail();
        d.deleteAtTail();
        d.deleteAtTail();

        d.display();
        d.displayReverse();
        d.insert(1, 55);
        System.out.println(d.size());
        d.insert(3, 45);
        d.insert(2, 99);
        d.insert(3, 100);
        d.insert(4, 80);
        d.display();
        System.out.println(d.size());
        d.delete(1);
        d.delete(4);
        d.delete(4);
        d.display();
        System.out.println(d.size);
    }
}
