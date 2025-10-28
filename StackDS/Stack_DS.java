package StackDS;

import java.util.EmptyStackException;
// Array Based Stack

class Stack {
    private int[] arr;
    private int top;
    private int maxSize;

    //Constructor
    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    // push operation - O(1)
    public void push(int val) {
        if(isFull()) {  // top == maxSize-1
            throw new StackOverflowError("Stack Overflow!");
        }
        arr[++top] = val;
    }
    // pop operation - O(1)
    public int pop() {
        if(isEmpty()) {  // top == -1
            throw new EmptyStackException();
        }
        System.out.println("Popped: " + arr[top] + " from the Stack.");
        int popped = arr[top];
        top--;
        return popped;
    }
    // peek operation - O(1)
    public int peek() {
        if(isEmpty()) {  //top == -1
            throw new EmptyStackException();
        }
        return arr[top];
    }
    // isEmpty
    public boolean isEmpty() {
        return top == -1;
    }
    // isFull
    public boolean isFull() {
        return top == maxSize-1;
    }
    // size
    public int size() {
        return top+1;
    }
    // display
    public void display() {
        if(top == -1) {
            throw new EmptyStackException();
        }
        for(int i = 0; i<=top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("(Top: " + arr[top] + ")");
    }
}

public class Stack_DS {
    public static void main(String[] args) {
        Stack s = new Stack(2);
        s.push(2);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.size());
    }
}
