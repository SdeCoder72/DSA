package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: ");
        int n = sc.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1st approach
        System.out.println("using while loop: ");
        int i = 0;
        int j = n-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
        System.out.println("Using for loop");

        //2nd approach
        for(int k = 0; k < n/2; k++) {
            int temp = arr[k];
            arr[k] = arr[n-1-k];
            arr[n-1-k] = temp;
        }

        for(int ele : arr) System.out.print(ele + " ");
    }
}
