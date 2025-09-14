package Recursion;

import java.util.Scanner;

public class LinearSearchRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: " );
        int n = sc.nextInt();
        System.out.print("Enter the elements of arr: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to find in arr: ");
        int ele = sc.nextInt();

        System.out.println(isElementPresent(arr, ele, 0));

    }
    public static boolean isElementPresent(int[] arr, int ele, int idx) {
        if(idx == arr.length) return false; // Base case
        if(ele == arr[idx]) return true;
        return isElementPresent(arr, ele, idx+1);
    }
}
