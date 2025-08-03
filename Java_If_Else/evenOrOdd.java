package If_Else;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {

    //       Take +ve integer input(n) and tell if it is odd or even

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a +ve Integer: ");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");


    }
}



