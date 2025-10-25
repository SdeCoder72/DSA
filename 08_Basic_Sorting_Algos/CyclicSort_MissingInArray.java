package Basic_Sorting_Algos;

import java.util.Scanner;

public class CyclicSort_MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while(i < n) {
            if(arr[i] == i+1 || arr[i] == n+1) i++;
            else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        System.out.println(check(arr, n));
    }
    public static int check(int[] arr, int n) {
        for(int i = 0; i<n; i++) {
            if(arr[i] != i+1) return i+1;

        }
        return n+1;
    }
}
