package QueueDS;
class Queue{
     int[] arr;
     int front;
     int rear;
     int size;
     int maxSize;
    //Constructor
    public Queue(int n) {
        maxSize = n;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
        size = 0;
    }
    // enqueued
    public void enqueued(int val) {
        if(isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        if(isEmpty()) {
            front = 0;
        }
        rear = (rear+1)%maxSize;
        arr[rear] = val;
        size++;
        System.out.println("Enqueued " + val);
    }
    public int dequeued() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        else {
            int dequeued = arr[front];
            System.out.println("Dequeued " + dequeued);
            if(front == rear) {
                front = -1;
                rear = -1;
                size = 0;
                return dequeued;
            }
            else {
                front = (front+1)%maxSize;
                size--;
            }
            return dequeued;
        }
    }
    //peek
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }
    //size
    public int size() {
        return size;
    }
    // display
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        for(int i = front; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        if(rear < front) {
            for(int i = 0; i<=rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    // check empty
    public boolean isEmpty() {
        return size == 0;
    }
    // check full
    public boolean isFull(){
        return (rear+1)% maxSize == front;
    }

}

public class ArrayBasedQueue {

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueued(10);
        q.enqueued(20);
        q.enqueued(30);
        q.dequeued();
//        q.dequeued();
//        q.dequeued();
//        q.dequeued();

        q.enqueued(50);
        q.enqueued(60);
        q.enqueued(70);
        System.out.println(q.size);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.peek());

    }
}
