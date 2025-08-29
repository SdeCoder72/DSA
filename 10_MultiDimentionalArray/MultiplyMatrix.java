package MultiDimentionalArray;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplyMatrix {
    public static void print(int[][] arr) {
        for(int[] a : arr) {
            for(int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter cols: ");
        int m = sc.nextInt();

        System.out.print("Enter elements of the 1st array: ");
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter elements of the 2nd array: ");
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        print(a);
        print(b);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            ans.add(new ArrayList<>());
            for(int j = 0; j<n; j++) {
                int sum = 0;
                for(int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                ans.get(i).add(sum);
            }
        }

        for(int i = 0; i<ans.size(); i++) {
            for(int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(ans);

    }
}
