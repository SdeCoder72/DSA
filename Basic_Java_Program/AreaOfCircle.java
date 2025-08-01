package Basic_Java_Program;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        System.out.println("Area of Circle");
        Scanner sc = new Scanner(System.in);  // to take input

        System.out.print("Enter radius(r): ");
        double r = sc.nextInt();
        double area = 3.1415 * r * r;
        System.out.println(area);

        //Volume of Sphere

        System.out.println("Volume of Sphere");
        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        double volumeOfSphere = 4.0/3 * 3.1415 * radius * radius * radius;
        System.out.println(volumeOfSphere);

        //Total surface of a cuboid

        System.out.println("Total surface of a cuboid");
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        double tsc = 2 * (l*w + w*h + h*l);
        System.out.println(tsc);


//        int r = 6;
//        System.out.println("Area of circle by taking r : " + r);
//        System.out.println(3.1415 * r * r); // the answer will be in double
    }
}
