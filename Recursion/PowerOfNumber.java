package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    public static int reverse(int a, int ans) {
        if(a == 0) return ans;

        int rem = a%10;
        ans = ans * 10 + rem;
        return reverse(a/10, ans);
    }

    public static int power(int a, int b) {
        if(b == 0) return 1;
        int call = power(a, b/2);
        if(b%2 == 0) return call * call;
        else return a * call * call;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int ans = 0;
        int b = reverse(n, ans);
        System.out.println(Math.pow(n, b));
        int res = power(n, b);
        System.out.println(res);
    }
}
