package MultiDimentionalArray;

import java.util.Scanner;

public class PrintElementsOf2DArrayColumnWise {
    public static void main(String[] args) {
        //elements: 2 8 3 4 7 7 2 1 6 3 5 5 4 1 4 3 1 8 2 6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter cols: ");
        int m = sc.nextInt();

        System.out.print("Enter elements of the array: ");
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
