package Recursion;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String n = sc.nextLine();
        int i = n.length()-1;
        StringBuilder sb = new StringBuilder();

        System.out.println(reverse(n,i, sb));


    }
    public static StringBuilder reverse(String n,int i,  StringBuilder sb) {
        if(i < 0) return sb;
        sb.append(n.charAt(i));
        return reverse(n, i-1, sb);
    }
}
