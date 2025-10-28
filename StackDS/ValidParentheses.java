package StackDS;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '(' && s.charAt(i) == ')' ||
                    st.peek() == '{' && s.charAt(i) == '}' ||
                    st.peek() == '[' && s.charAt(i) == ']' )
                {
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }

    // 2nd Approach
    public static boolean isValid(String s) {
        if(s.length() %2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') stack.push(')');
            else if(c == '{') stack.push('}');
            else if(c == '[') stack.push(']');
            else if(stack.isEmpty() || stack.peek() != c) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValidParentheses("(({[]{}})[])"));
        System.out.println(isValidParentheses("(({}}}]"));
        System.out.println(isValidParentheses("((({{)}"));

        System.out.println(isValid("(({[]{}})[])"));
        System.out.println(isValid("(({}}}]"));
        System.out.println(isValid("((({{)}"));
    }
}
