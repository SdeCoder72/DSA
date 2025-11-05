package StackDS;

import java.util.Stack;

public class ReverseArrayOrString {
    public static char[] reverse(char[] s) {
        int n = s.length;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            st.push(s[i]);
        }
        int i = 0;
        while(!st.isEmpty()) {
            s[i] = st.pop();
            i++;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(reverse(arr));
    }
}
