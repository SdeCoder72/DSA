package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int i = 0, j = n-1;
        boolean flag = true;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
                i++;
                j--;

        }

        if(flag) System.out.println("String is palindrom");
        else System.out.println("Sting is not a palindrom");
    }
}
