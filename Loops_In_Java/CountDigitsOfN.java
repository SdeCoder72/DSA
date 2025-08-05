package Loops;

import java.util.Scanner;

public class CountDigitsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n==0) n = 1; // if given input is 0

        int count = 0;
        while(n != 0) {
            count++;
            n /=  10;
        }
        System.out.println(count);
    }
}
