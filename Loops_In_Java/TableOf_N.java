package Loops;

import java.util.Scanner;

public class TableOf_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n*i);
        }
    }
}
