package Pattern_Printing;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (Note: n should be odd): ");
        int n = sc.nextInt();

        // n should be odd..

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == (n+1)/2 || j == (n+1)/2) {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
