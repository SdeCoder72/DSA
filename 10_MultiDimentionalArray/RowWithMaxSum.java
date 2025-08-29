package MultiDimentionalArray;

import java.util.Scanner;

public class RowWithMaxSum {
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

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int maxRow = arr[0][0];
        int maxRowSum = Integer.MIN_VALUE;
        for(int i= 0; i<n; i++) {
            int sum = 0;
            for(int j=0; j<m; j++) {
                sum += arr[i][j];
            }
            if(sum > maxRowSum) {
                maxRow = i;
                maxRowSum = sum;
            }
        }
        System.out.println("Row no." + (maxRow+1) + " has highest sum of " + maxRowSum);
    }
}
