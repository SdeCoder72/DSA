package Basic_Sorting_Algos;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for(int i = 0; i<n-1; i++) {
            if(arr[i] > arr[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Array is sorted.");
        else System.out.println("Array is not sorted.");
    }
}
