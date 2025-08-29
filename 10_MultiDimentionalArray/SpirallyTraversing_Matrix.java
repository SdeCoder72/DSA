package MultiDimentionalArray;

import java.util.ArrayList;
import java.util.Scanner;

public class SpirallyTraversing_Matrix {
    public static void main(String[] args) {
//        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
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

        int frow = 0, lrow = n-1, fcol = 0, lcol = m-1;
        ArrayList<Integer> ans = new ArrayList<>();

        int count = n*m;
        while(count != 0) {

            for(int i = fcol; i<=lcol; i++) {
                ans.add(arr[frow][i]);
                count--;
            }
            frow++;

            if(count == 0) break;


            for(int j = frow; j<=lrow; j++){
                ans.add(arr[j][lcol]);
                count--;
            }
            lcol--;
            if(count == 0) break;

            for(int i = lcol; i >= fcol; i--) {
                ans.add(arr[lrow][i]);
                count--;
            }
            lrow--;
            if(count == 0) break;

            for(int j = lrow; j >= frow; j--) {
                ans.add(arr[j][fcol]);
                count--;
            }
            fcol++;
        }






//        while(frow <= lrow && fcol <= lcol) {
//
//            for(int i = fcol; i<=lcol; i++) {
//                ans.add(arr[frow][i]);
//            }
//            frow++;
//
//            if(frow == lrow || fcol == lcol) break;
//
//            for(int j = frow; j<=lrow; j++){
//                ans.add(arr[j][lcol]);
//            }
//            lcol--;
//
//            if(frow == lrow || fcol == lcol) break;
//
//            for(int i = lcol; i >= fcol; i--) {
//                ans.add(arr[lrow][i]);
//            }
//            lrow--;
//
//            if(frow == lrow || fcol == lcol) break;
//
//            for(int j = lrow; j >= frow; j--) {
//                ans.add(arr[j][fcol]);
//            }
//            fcol++;
//        }

        System.out.println(ans);


    }
}
