package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int i = 0, j = 0;
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        while(j<n) {
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) j++;
            else {
                int freq = j-i;
                ans.append(freq).append(Character.toLowerCase(s.charAt(i)));
                i = j;
            }
        }
        int freq = j-i;
        ans.append(freq).append(Character.toLowerCase(s.charAt(i)));

        System.out.println(ans.toString() + " " + ans.length());


    }
}
