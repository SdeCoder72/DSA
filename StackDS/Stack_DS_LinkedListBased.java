package StackDS;
import java.util.EmptyStackException;
class Node{
    int val;
    Node next;
    //constructor;
    public Node(int val) {
        this.val = val;
        next = null;
    }
}
class StackLL{
    Node top;
    int size;
    //constructor
    public StackLL() {
        top = null;
        size = 0;
    }

    //push
    public void push(int val) {
        Node temp = new Node(val);
        temp.next = top;
        top = temp;
        size++;
    }
    // pop
    int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int popped = top.val;
        top = top.next;
        size--;
        System.out.println("Popped: " + popped);
        return popped;

    }
    // peek
    int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.val;
    }
    // isEmpty
    boolean isEmpty() {
        return top == null;
    }
    // size
    int size() {
        return size;
    }
    // display
    void display(){
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        Node current = top;
        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    // Clear entire Stack
    void clear() {
        top = null;
        size = 0;
        System.out.println("Stack Cleared!");
    }
}
public class Stack_DS_LinkedListBased {
    public static void main(String[] args) {

        StackLL s = new StackLL();
        s.push(6);
        s.push(8);
        s.display();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.peek());
        s.pop();
        s.display();
        s.clear();
        s.display();
        System.out.println(s.isEmpty());

    }
}
