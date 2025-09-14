package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetOfString {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subset("", s, 0, list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void subset(String ans, String s, int i, List<String> list) {
        if(i == s.length()) {
            if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subset(ans + ch, s, i+1, list);  // pick
        subset(ans, s, i+1, list);
    }


}
