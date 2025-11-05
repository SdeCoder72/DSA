package QueueDS;

class QueueLL{
    static class Node{
        int val;
        Node next;
        //Constructor
        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;
    //Constructor
    public QueueLL() {
        front = null;
        rear = null;
        size = 0;
    }

    //enqueued
    public void enqueued(int val) {
        Node temp = new Node(val);
        if(isEmpty()) {
            front = temp;
        }
        else{
            rear.next = temp;
        }
        rear = temp;
        size++;
        System.out.println("Enqueued " + val);
    }
    // dequeued
    public int dequeued() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int popped = front.val;
        front = front.next;
        size--;
        System.out.println("Dequeued " + popped);
        return popped;
    }
    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }
    // peek
    public int peek() {
        return front.val;
    }
    // size
    public int size() {
        return size;
    }
    // display
    public void display() {
        if(isEmpty()) {
            System.out.println("Queued is Empty!");
            return;
        }
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}

public class LinkedListBasedQueue {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueued(10);
        q.enqueued(20);
        q.enqueued(30);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.dequeued());
        System.out.println(q.dequeued());
        System.out.println(q.dequeued());
        System.out.println(q.dequeued());
        q.enqueued(10);
        q.enqueued(20);
        q.enqueued(30);
        q.enqueued(40);
        q.enqueued(50);
        q.enqueued(60);
        q.display();
    }
}
