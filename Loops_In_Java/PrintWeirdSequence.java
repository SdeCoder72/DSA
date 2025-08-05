package Loops;

import java.util.Scanner;

public class PrintWeirdSequence {
    public static void main(String[] args) {

        //print -  1 n 2 n-1 3 n-2....
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            System.out.println(i);
            System.out.println(n-i+1);
        }

    }
}
