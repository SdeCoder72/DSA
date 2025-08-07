package Pattern_Printing;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int col = sc.nextInt();
        for(int i = 1; i<=row; i++) {
            for(int j = 1; j<=col; j++) {
                if(i == 1 || j == 1 || i == row || j == col) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
