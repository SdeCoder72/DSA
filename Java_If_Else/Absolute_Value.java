package If_Else;

import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // using only if statement
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n < 0) n = -n;
        System.out.println(n);

        // using if else statement
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        if(a >= 0) System.out.println(n);
        else System.out.println(-n);
    }
}
