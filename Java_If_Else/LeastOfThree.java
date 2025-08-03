package If_Else;

import java.util.Scanner;

public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        // if else-if else statement

//        if(a <= b && a <= c) System.out.println(a);
//        else if(b <= c) System.out.println(b);
//        else System.out.println(c);

        // ternary operator

        System.out.println((a <= b && a <= c) ? a : ((b <= c) ? b : c));
    }
}
