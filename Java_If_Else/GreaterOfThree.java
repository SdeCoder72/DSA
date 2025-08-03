package If_Else;

import java.util.Scanner;

public class GreaterOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        // if else if esle statement

//        if (a >= b && a >= c) System.out.println(a);
//        else if(b >= a && b >= c) System.out.println(b);
//        else System.out.println(c);



        // nested loop

//        if(a >= b) {   // a > b
//            if(a >= c) System.out.println(a);  // a > c  sout - a
//            else System.out.println(c);    // a < c sout - c
//        }
//        else {   // b > a
//            if(b >= c) System.out.println(b);  // b > c sout - b
//            else System.out.println(c);   // b < c   sout - c
//        }

        //ternary operator

        System.out.println((a>=b)? ((a>=c) ? a : c ) : ((b>=c)? b : c));
    }
}
