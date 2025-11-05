package StackDS;

import java.util.Stack;

public class MinAddToMakeParenthesesValid {
    /*
    LeetCode - 921
    Input: s = "())"
    Output: 1

    Input: s = "((("
    Output: 3
     */


    public static int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {  // opening
                open++;
            }
            else {  // closing
                if(open == 0) close++;
                else open--;
            }
        }
        return open + close;
    }

    public static int minAddToMakeValid2(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {  // opening
                st.push(s.charAt(i));
            }
            else {  // closing
                if(st.isEmpty()) count++;
                else st.pop();
            }
        }
        return count + st.size();
    }
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("))((()"));  // 4
        System.out.println(minAddToMakeValid(")))"));  //3
        System.out.println(minAddToMakeValid2("))((()")); // 4
        System.out.println(minAddToMakeValid2("(((")); //3
    }
}
