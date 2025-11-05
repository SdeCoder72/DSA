package StackDS;
import java.util.Stack;

/*  leetCode - 844

        Example 1:

        Input: s = "ab#c", t = "ad#c"
        Output: true
        Explanation: Both s and t become "ac".
        Example 2:

        Input: s = "ab##", t = "c#d#"
        Output: true
        Explanation: Both s and t become "".
        Example 3:

        Input: s = "a#c", t = "b"
        Output: false
        Explanation: s becomes "c" while t becomes "b".
     */

public class BackgroundStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c != '#') st.push(c);
            else if(!st.isEmpty()) st.pop();
        }
        for(char c : t.toCharArray()) {
            if(c != '#') stk.push(c);
            else if(!stk.isEmpty()) stk.pop();
        }
        if(st.size() != stk.size()) return false;
        while(!st.isEmpty()) {
            if(st.pop() != stk.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));  // true
        System.out.println(backspaceCompare("ab##","c#d#"));  // true
        System.out.println(backspaceCompare("a#c","b"));  //false
        System.out.println(backspaceCompare("a##c", "#a#c")); //true

    }
}
