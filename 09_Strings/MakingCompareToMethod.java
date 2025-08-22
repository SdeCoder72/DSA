package Strings;

import java.util.Scanner;

public class MakingCompareToMethod {
    public static int compareTo(String a, String b) {
        int n = a.length();
        int m = b.length();
        int i = 0, j= 0;
        while(i < n && j < m) {
            if(a.charAt(i) != b.charAt(j)) {
                return (a.charAt(i) - b.charAt(j));
            }
            i++;
            j++;
        }
        return (n-m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String a = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String b = sc.nextLine();

        System.out.println(compareTo(a,b));
        System.out.println(a.compareTo(b));

    }
}
