package Loops;

import java.util.Scanner;

public class OddDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for(int i = n*2; i <= 100; i+=n) {
            if(i%2 != 0) System.out.println(i);
        }
    }
}
