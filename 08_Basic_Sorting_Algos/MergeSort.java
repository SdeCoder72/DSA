package Basic_Sorting_Algos;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr);
        for(int ele: arr) System.out.print(ele + " ");

    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        //Base case (if the length of the array is 1 then it's already sorted)
        if(n == 1) return;
        // create to empty arrays with size of n/2
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;

        for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i<b.length; i++) b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);

        mergeTwoSortedArray(a, b, arr);
    }

    public static void mergeTwoSortedArray(int[] a, int[] b, int[] arr) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) {
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while (i<a.length) arr[k++] = a[i++];
        while(j < b.length) arr[k++] = b[j++];
    }

}
