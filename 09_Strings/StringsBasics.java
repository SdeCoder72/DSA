package Strings;

import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();  // Take entire string
        System.out.println(s);
        String t = sc.next();  // only takes 1st word of the string
        System.out.println(t);

        // Normal string
        String str = "What are you doing";
        System.out.println(str);

        // charAt()
        System.out.println(str.charAt(6));

        // length()
        System.out.println(str.length());


        char[] arr = {'s', 'h', 'a', 'n', 'a', 'y', 'a'};
        for(char ele : arr) System.out.print(ele+" ");
    }
}
