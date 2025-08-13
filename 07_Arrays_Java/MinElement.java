package Arrays;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        System.out.print("Enter array Element: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //print
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = Integer.MAX_VALUE;   // or mar = Interger.MIN_VALUE
        for(int i=0; i<n; i++) {
            if(arr[i] < min) min = arr[i];
        }
        System.out.println(min);
    }
}
