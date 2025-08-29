package MultiDimentionalArray;

import java.util.Scanner;

public class ReverseAllCols {
    public static void print(int[][] arr) {
        for(int[] a : arr) {
            for(int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
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
        print(arr);
        System.out.println("Reversed...");

        for(int i = 0; i<m; i++) {
            int s = 0, l = n-1;
            while(s < l) {
                int temp = arr[s][i];
                arr[s][i] = arr[l][i];
                arr[l][i] = temp;
                s++;
                l--;
            }
        }

        print(arr);
    }
}
