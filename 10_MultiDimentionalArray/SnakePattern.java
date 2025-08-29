package MultiDimentionalArray;

import java.util.Scanner;

public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter cols: ");
        int m = sc.nextInt();

        System.out.print("Enter elements of the array: ");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] a : arr) {
            for(int ele : a) {
                System.out.print(ele + " ") ;
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i<n; i++) {
            if(i%2 == 0) {
                for(int ele: arr[i]) System.out.print(ele + " ");
            }
            else {
                for(int j = m-1; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
