package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

//        for(int i = 1; i <= n; i++) {
//            for(int k = 1; k <= n-i; k++) {
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=(2*i-1); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//






//        System.out.println();
//
//        int a = 1;
//        for(int i = 1; i <= n; i++) {
//            for(int k = 1; k <= n-i; k++) {
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=a; j++) {
//                System.out.print("* ");
//            }
//            a+=2;
//            System.out.println();
//        }


        System.out.println();
        int nsp = n-1;
        int nst = 1;

        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            nsp--;
            for(int j = 1; j<=nst; j++) {
                System.out.print("* ");
            }
            nst+=2;
            System.out.println();
        }
        nsp = 1;
        nst -= 4;

        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= nsp; k++) {
                System.out.print("  ");
            }
            nsp++;
            for(int j = 1; j<=nst; j++) {
                System.out.print("* ");
            }
            nst-=2;
            System.out.println();
        }


    }
}
