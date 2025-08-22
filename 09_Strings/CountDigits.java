package Strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);  // or simply s = ""; s += n;
        System.out.println(s.length());

        System.out.print("Enter a Double: ");
        double d = sc.nextDouble();
        String str = "";
        str += d;
        System.out.println(str);
    }
}
