package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: ");
        int n = sc.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Largest element is: " + max);
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            if(arr[i] > secondMax && arr[i] != max) secondMax = arr[i];
        }
        System.out.println("Second Largest element is: " + secondMax);
    }
}
