package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastOccurrenceRecursion {
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

        System.out.print("First Occurrence of " + ele + " is on index : " );
        int first = firstOccurrence(arr, ele, 0, n-1, -1);
        int last = lastOcc(arr, ele, 0, n-1, -1);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        System.out.println(res);
    }
    public static int firstOccurrence(int[] arr, int ele, int low, int high, int ans) {
        if(low > high) return ans;

        int mid = low + (high-low)/2;
        if(arr[mid] == ele) {
            ans = mid;
            return firstOccurrence(arr, ele, low, mid-1, ans);
        }
        else if(arr[mid] > ele) return firstOccurrence(arr, ele, low, mid-1, ans);
        else return firstOccurrence(arr, ele, mid+1,high, ans);


    }
    public static int lastOcc(int[] arr, int ele, int low, int high, int ans) {
        if(low > high) return ans;

        int mid = low + (high - low)/2;
        if(arr[mid] == ele) {
            ans = mid;
            return lastOcc(arr, ele, mid+1, high, ans);
        }
        else if(arr[mid] > ele) return lastOcc(arr, ele, low, mid-1, ans);
        else return lastOcc(arr, ele, mid+1, high, ans);
    }



}
