package If_Else;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // using ternary operator
        int positiveInt = (n >= 0)? 100 : 0;

        // Using if else statement
//        if(n >= 0) positiveInt = 100;
//        else positiveInt = 0;


        System.out.println(positiveInt);
    }
}
