package Basic_Sorting_Algos;

import java.util.Scanner;

public class kthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Kth value: ");
        int k = sc.nextInt();

        for(int i=0; i<k; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j = i; j < n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }

        System.out.println(arr[k-1]);
    }
}
