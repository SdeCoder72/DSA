package Recursion;

import java.util.Scanner;

public class A_RaiseToThePower_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();

        int res = power2(a, b);
        System.out.println(Math.pow(a, b));
        System.out.println(res);
    }
    public static int power(int a, int b) {
        if(b==0) return 1;

        return a * power(a, b-1);
    }
    public static int power2(int a, int b) {
        if(b==0) return 1;

        int call = power2(a, b/2);
        if(b%2 == 0) return call * call;
        else return a * call * call;
    }
}
