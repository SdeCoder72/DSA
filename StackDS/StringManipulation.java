package StackDS;

import java.util.Objects;
import java.util.Stack;

public class StringManipulation {
    public static int removeConsecutiveSame(String[] arr) {
        Stack<String> st = new Stack<>();
        for(int i = 0; i<arr.length; i++) {
            if(st.isEmpty()) st.push(arr[i]);
            else if(Objects.equals(st.peek(), arr[i])) {
                st.pop();
            }
            else st.push(arr[i]);
        }
        return st.size();
    }
    public static void main(String[] args) {
        /*
        Input: arr[] = ["ab", "aa", "aa", "bcd", "ab"]
        Output: 3  size of the array after removing elements
        Explanation: After the first iteration, we'll have: ab bcd ab.
         We can't further destroy more strings and hence we stop and the result is 3.
         */
        String[] arr = {"ab", "aa", "aa", "bcd", "ab"};
        String[] arr2 = {"tom", "jerry", "jerry", "tom"};
        System.out.println(removeConsecutiveSame(arr));
        System.out.println(removeConsecutiveSame(arr2));
    }
}
