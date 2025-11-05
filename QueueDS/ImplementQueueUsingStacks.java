package QueueDS;
import java.util.Stack;

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    int peek;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
        peek = -1;
    }

    public void push(int x) {
        if(input.isEmpty()) {
            peek = x;
        }
        input.add(x);
    }

    public int pop() {
        if(!output.isEmpty()) return output.pop();
        while(!input.isEmpty()) {
            output.push(input.pop());
        }
        return output.pop();
    }

    public int peek() {
        if(!output.isEmpty()) return output.peek();
        return peek;

    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }

    public int size() {
        return output.size() + input.size();
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(29);
        q.push(48);
        System.out.println(q.pop());
        System.out.println(q.peek());
        q.push(57);
        q.push(54);
        q.pop();
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.input.isEmpty());
    }
}
