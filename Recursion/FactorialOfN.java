package Recursion;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int res = fact(n);
        System.out.println(res);
    }
    public static int fact(int n) {
        if(n == 1 || n == 0) return 1;

        return n*fact(n-1);

        //ternary operator
//        return (n <= 1) ? 1 : n*fact(n-1);
    }
}
