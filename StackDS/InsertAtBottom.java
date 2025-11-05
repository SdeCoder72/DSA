package StackDS;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(8);
        int x = 6;
        System.out.println(st);
        System.out.println(insertAtBottom(st, x));
    }

    private static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> s = new Stack<>();
        while(!st.isEmpty()) {
            s.push(st.pop());
        }
        st.push(x);
        while(!s.isEmpty()) {
            st.push(s.pop());
        }
        return st;
    }
}
