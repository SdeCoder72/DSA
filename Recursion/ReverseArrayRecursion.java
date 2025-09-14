package Recursion;

import java.util.Scanner;

public class ReverseArrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: " );
        int n = sc.nextInt();
        System.out.print("Enter the elements of arr: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr);
        reverseArray(arr, 0, n-1);
        System.out.println();
        print(arr);
    }
    public static void reverseArray(int[] arr, int i, int j) {
        if(i > j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseArray(arr, i+1, j-1);
    }
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
