package Pattern_Printing;

import java.util.Scanner;

public class Star_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
