package Strings;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";

        //converting number to string
        s += n;
        System.out.println(s); // "value of n"
        String t = Integer.toString(n);
        System.out.println(t);

    }
}
