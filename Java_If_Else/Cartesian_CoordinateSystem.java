package If_Else;

import java.util.Scanner;

public class Cartesian_CoordinateSystem {
    public static void main(String[] args) {
        
        //Given a point (x,y) write a program to find out if it lies in the 1st, 2nd, 3rd or 4th quadrant or x-axis, y-axis or origin

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        if(x == 0 && y == 0) System.out.println("Origin");
        else if(x == 0) System.out.println("y-axis");
        else if(y == 0) System.out.println("x-axis");
        else if(x > 0 && y > 0) System.out.println("1st Quadrant");
        else if(x < 0 && y > 0) System.out.println("2nd Quadrant");
        else if(x < 0) System.out.println("3rd Quadrant");
        else System.out.println("4th Quadrant");
    }
}
