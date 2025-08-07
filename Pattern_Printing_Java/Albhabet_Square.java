package Pattern_Printing;

import java.util.Scanner;

public class Albhabet_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                if(i%2 == 1) System.out.print((char)(96+i)+ " ");
                else System.out.print((char)(64+i) + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                System.out.print((char)(64+i) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print((char)(96+j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print((char)(64+j) + " ");
            }
            System.out.println();
        }
    }
}
