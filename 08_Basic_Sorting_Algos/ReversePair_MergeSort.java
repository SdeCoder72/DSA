package Basic_Sorting_Algos;

import java.util.Scanner;

public class ReversePair_MergeSort {
    public static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        count = 0;
        mergeSort(arr);
        System.out.println(count);

    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n == 1) return;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int idx = 0;
        for(int i=0; i<a.length;i++) a[i] = arr[idx++];
        for(int i=0; i<b.length;i++) b[i] = arr[idx++];

        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);

    }
    public static void merge(int[] a, int[] b, int[] arr) {
        int i=0, j=0, k=0;
        while(i < a.length && j<b.length) {
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else {
                if(a[i] > 2*b[j]) count += a.length-i;
                arr[k++] = b[j++];
            }

        }
        while (i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }
}
