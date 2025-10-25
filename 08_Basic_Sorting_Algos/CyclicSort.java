package Basic_Sorting_Algos;

import java.util.Scanner;

public class CyclicSort {
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
            if(arr[i] == i) i++;
            else {
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        for(int ele: arr) System.out.print(ele + " ");
    }
}
