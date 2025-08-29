package MultiDimentionalArray;

import java.util.Scanner;

public class MinElementOutOfMaxElementsOfEachRow {
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

        int minElement = Integer.MAX_VALUE;
        for(int i= 0; i<n; i++) {
            int maxRowElement = Integer.MIN_VALUE;
            for(int j=0; j<m; j++) {
                if(arr[i][j] > maxRowElement) {
                    maxRowElement = arr[i][j];
                }
            }
            if(maxRowElement < minElement) {
                minElement = maxRowElement;
            }
        }
        System.out.println(minElement);
    }
}
