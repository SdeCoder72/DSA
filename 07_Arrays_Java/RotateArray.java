package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d : ");
        int d = sc.nextInt();
        d = d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        for(int ele : arr) System.out.print(ele + " ");

    }
    public static void reverse(int[] arr, int s, int l) {
        while(s < l) {
            int temp = arr[s];
            arr[s] = arr[l];
            arr[l] = temp;
            s++;
            l--;
        }

    }
}
