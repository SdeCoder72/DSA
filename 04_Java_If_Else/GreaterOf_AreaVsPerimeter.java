package If_Else;

import java.util.Scanner;

public class GreaterOf_AreaVsPerimeter {
    public static void main(String[] args){

        //Take length and breadth of a rectangle as input and write a program to find the area of rectangle is greater than its perimeter

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();

        int areaOfRec = l * b;
        int perimeterOfRec = 2 * (l + b);

        // if else statement

        if(areaOfRec > perimeterOfRec) System.out.println("Area is Greater.");
        else System.out.println("Perimeter is Greater.");


        //ternary operater

//        System.out.println((areaOfRec > perimeterOfRec) ? "Area is Greater" : "perimeter is Greater");
    }
}
