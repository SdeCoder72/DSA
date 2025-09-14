package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, sb, ans);
        System.out.println(ans);

        List<String> ans2 = new ArrayList<>();
        generate2(n, 0, 0, "", ans2);
        System.out.println(ans2);

    }
    public static void generate(int n, int open, int close, StringBuilder sb, List<String> ans) {
        if(close == n) {
            ans.add(sb.toString());
            return;
        }
        if(open < n) {
            sb.append("(");
            generate(n, open+1, close, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open > close) {
            sb.append(")");
            generate(n, open, close+1, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }


    public static void generate2(int n, int r, int l, String s, List<String> ans) {
        if(r == n) {
            ans.add(s);
            return;
        }

        if(l < n) generate2(n, r, l+1, s + "(", ans);
        if(r < l) generate2(n, r+1, l, s+")", ans);
    }
}
