package Loops;

import java.util.Scanner;

public class AP_uptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term: ");

        int n = sc.nextInt();

        // 2, 5, 8, 11
        System.out.print("Enter the first term(a): ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference(d): ");
        int d = sc.nextInt();

        //useful when we know the number of terms
        if(d < 0){  // if the number is decreacing
            for(int i = 1; a > 0; i++) {
                System.out.print(a + " ");
                a += d;
            }
        }

        for(int i = 1; i<=n; i++) {
            System.out.print(a + " ");
            a+=d;
        }
//
//        for(int i = 2; i <= 3*n-1; i+=3){
//            System.out.print(i + " ");
//        }
    }
}
