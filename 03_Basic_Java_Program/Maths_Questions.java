package Basic_Java_Program;

import java.util.Scanner;

public class Maths_Questions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Calculate simple interest

        System.out.print("Enter The principle amount: ");
        double p = sc.nextInt();

        System.out.print("Enter The Rate of interest: ");
        double r = sc.nextInt();

        System.out.print("Enter The time: ");
        double t = sc.nextInt();

        double si = p*r*t/100.;
        System.out.println(si);

        // take input from the user and print the square of it

        System.out.println("square of number");
        System.out.print("Enter the Number: ");
        double n = sc.nextInt();

        double square = n*n;
        System.out.println(square);

    }
}
