package Basic_Sorting_Algos;

import java.util.Scanner;

public class BubbleSort {
    public static void print(int[] arr) {
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
//        for(int i= 0; i<n-1; i++) {
//            for(int j= 0; j < n-1-i; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        print(arr);

        //bubble sort optimizes
//        for(int i= 0; i<n-1; i++) {
//            boolean isSorted = true;
//            for(int j = 0; j < n-1; j++) {
//                if(arr[j] > arr[j+1]) {
//                    isSorted = false;
//                    break;
//                }
//            }
//            if(isSorted) break;
//            for(int j= 0; j < n-1-i; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        print(arr);

        // another approach
        for(int i= 0; i<n-1; i++) {
            int swaps = 0;
            for(int j= 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        print(arr);
    }
}
