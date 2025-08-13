package Loops;

import java.util.Scanner;

public class SumAndReverse {
    public static void main(String[] args) {
        // Take 'n' as input and print the reverse and their sum

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int originalNum = n;
        int reverse = 0;

        while(n != 0) {
            reverse *= 10;
            reverse += n%10;
            n /= 10;
        }

        System.out.println("Reverse of the Number is " + reverse);
        System.out.println("The sum of "+ reverse+ " and " + originalNum + " is " + (reverse + originalNum));
    }
}
