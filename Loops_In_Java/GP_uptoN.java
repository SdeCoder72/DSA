package Loops;

import java.util.Scanner;

public class GP_uptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term: ");

        int n = sc.nextInt();

        // 1, 2, 4, 8, 16, 32....
        System.out.print("Enter the first term(a): ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio(r): ");
        int r = sc.nextInt();

        for(int i = 1; i <=n; i++) {
            System.out.print(a + " ");
            a *= r;
        }

    }

}
