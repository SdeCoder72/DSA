package Strings;

import java.util.Scanner;

public class NonRepeatingCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int n = s.length();
        int[] arr = new int[26];
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            int idx = ch -97;
            arr[idx]++;
        }


        char ans = '$';
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 97;
            if(arr[idx] == 1) {
                ans = ch;
                break;
            }
        }
        System.out.println(ans);
    }
}
