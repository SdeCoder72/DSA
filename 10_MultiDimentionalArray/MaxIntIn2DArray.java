package MultiDimentionalArray;

import java.util.Scanner;

public class MaxIntIn2DArray {
    public static void main(String[] args) {
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

        int max = arr[0][0];
        for(int i= 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
