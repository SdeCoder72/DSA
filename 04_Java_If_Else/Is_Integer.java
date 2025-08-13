package If_Else;

import java.util.Scanner;

public class Is_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double n = sc.nextDouble();
        int x = (int)n;
//        if(n-x > 0) System.out.println("Not an Integer");  // if(n-x == 0) sout("is an Integer");
//        else System.out.println("Is an Integer");
        if(n == (int)n) System.out.println("Is an Integer");
        else System.out.println("Not an Integer");
    }
}
