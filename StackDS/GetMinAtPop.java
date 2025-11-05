package StackDS;

import java.util.Stack;
/*
Input: arr[] = [1, 2, 3, 4, 5]
Output: [1, 1, 1, 1, 1]
 */

public class GetMinAtPop {
    public static Stack<Integer> _push(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            if(st.isEmpty()) st.push(arr[i]);
            else st.push(Math.min(st.peek(), arr[i]));
        }
        return st;
    }

    public static void _getMinAtPop(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 43, 1, 2, 0, 5};
        Stack<Integer> st = _push(arr, 7);
        _getMinAtPop(st);  // 0, 0, 1, 1, 1, 1, 1
    }
}
