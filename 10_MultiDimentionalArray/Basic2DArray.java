package MultiDimentionalArray;

import java.util.Scanner;

public class Basic2DArray {
    public static void main(String[] args) {
        //fixed size 2D array
//        int[][] arr = new int[3][2];

        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9,6,4,3}};

        //accessing
        System.out.println(arr2[2][3]);

        // Taking input from the user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter cols: ");
        int m = sc.nextInt();

        System.out.print("Enter elements of the array: ");
        int[][] arr3 = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

        //printing
        for(int i= 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
