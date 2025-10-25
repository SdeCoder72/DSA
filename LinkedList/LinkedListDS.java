package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class Linkedlist{
    Node head;  //null
    Node tail;//null
    int size;
    void addAtEnd(int val) {
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void print() {
        if(head == null) return;
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void addAtHead(int val){
//        Node temp = new Node(val);
//        if(head == null) head = tail = temp;
//        else {
//            temp.next = head;
//            head = temp;
//        }
//        size++;

        // 2nd way
        if(head == null) {
            addAtEnd(val);
        }
        else {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if(head ==null) tail = null;
        size--;
    }

    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int index = 0;
        while(temp != null) {
            if(temp.val == val) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
    void insert(int idx, int val) {
        if(idx > size || idx < 0) System.out.println("ERROR: index " + idx+ " is not present.");
        else if(idx == size) addAtEnd(val);
        else if(idx == 0) addAtHead(val);
        else {
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node insertNode = new Node(val);
            insertNode.next = temp.next;
            temp.next = insertNode;
            size++;
        }

    }
    void delete(int idx) {
        if(idx < 0 || idx >= size) System.out.println("INVALID VALUE");
        else if(idx == 0) deleteAtHead();
        else {
            Node temp = head;
            for(int i = 1; i<idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size-1) tail = temp;
            size--;
        }
    }
    int get(int idx) {
        Node temp = head;
        if(idx >= size || idx < 0 ) return -1;
        else {
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.val;
        }

    }

}

public class LinkedListDS {
    public static void main(String[] args) {
        Linkedlist l  = new Linkedlist();
        l.addAtEnd(10);
        l.addAtEnd(20);
        l.addAtEnd(30);
        l.print();
        l.addAtHead(40);
        l.addAtHead(50);
        l.print();
        l.deleteAtHead();
        l.print();
        System.out.println(l.size);
        l.print();
        System.out.println(l.search(50));
        System.out.println(l.search(20));
        l.insert(2, 57);
        l.print();
        l.delete(0);
        l.print();
        System.out.println(l.get(4));


    }


}
