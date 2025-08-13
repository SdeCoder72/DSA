package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n < 0 ) n = -n;   // if given number is -ve

        int reverse = 0;
        while(n != 0) {
            reverse *= 10;
            reverse += (n%10);
            n /=  10;
        }
        System.out.println(reverse);
    }
}
