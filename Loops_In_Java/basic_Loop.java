package Loops;

import java.util.Scanner;

public class basic_Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            System.out.println("Hey it's : " + i);
        }

        for(int i=1; i<=10; i++) {
            System.out.println("Hello World!");
        }

        // printing numbers
        for(int i = 1; i<= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        //printing reverse number
        for(int i = n; i>=1; i--) {
            System.out.print(i + " ");
        }
    }
}
