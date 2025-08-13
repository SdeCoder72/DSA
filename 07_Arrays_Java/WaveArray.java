package Arrays;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
