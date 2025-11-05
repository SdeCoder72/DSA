package StackDS;

import java.util.ArrayList;
import java.util.Stack;
/*
        Input:  str = "(aa(bdc))p(dee)"
        Output: 1 2 2 1 3 3
        Explanation: The highlighted brackets in
        the given string (aa(bdc))p(dee) are
        assigned the numbers as: 1 2 2 1 3 3.
 */

public class PrintBracketNumber {
    public static ArrayList<Integer> bracketNumbers(String str) {
        // code here
        int count = 0;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(char c : str.toCharArray()) {
            if(c == '('){
                count++;
                st.push(count);
                ans.add(count);
            }
            else if(c == ')') ans.add(st.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(bracketNumbers("(aa(bdc))p(dee)"));  //1, 2, 2, 1, 3, 3
        System.out.println(bracketNumbers("(((()("));  // 1, 2, 3, 4, 4, 5
    }
}
