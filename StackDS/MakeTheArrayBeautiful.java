package StackDS;

import java.util.*;
import java.util.Stack;

public class MakeTheArrayBeautiful {
    public static ArrayList<Integer> beautifulArray(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++) {
            if(st.isEmpty()) st.push(arr[i]);
            else if(st.peek() < 0 && arr[i] >= 0 ||
                    st.peek() >= 0 && arr[i] < 0
            ) {
                st.pop();
            }
            else {
                st.push(arr[i]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            ans.add(0, st.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -4, 6, -2, -8, 9};
        System.out.println(beautifulArray(arr));
    }
}
