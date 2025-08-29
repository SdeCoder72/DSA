package MultiDimentionalArray;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        //for transposing a matrix the number of rows and cols should be same
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter elements of the array: ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        print(arr);
        System.out.println();

//        for(int i = 0; i<n; i++) {
//            for(int j = i; j<n; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);
    }
    public static void print(int[][] arr) {
        for(int[] a : arr) {
            for(int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
