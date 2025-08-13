package Pattern_Printing;

import java.util.Scanner;

public class Star_HorizontallyFlippedTriangle_HFT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n+1-i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        int a = n;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=a; j++) {
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }

        System.out.println();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n-i+1); j++) {
                System.out.print((char)(96+j) + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n-i+1); j++) {
                System.out.print((char)(96+i) + " ");
            }
            System.out.println();
        }
    }
}
