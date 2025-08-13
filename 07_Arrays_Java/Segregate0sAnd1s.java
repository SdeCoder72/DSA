package Arrays;

import java.util.Scanner;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //optimized approach
        int i = 0;
        int j = n-1;
        while(i < j) {
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele : arr) System.out.print(ele + " ");


        // Approach 2

//        int numOf0s = 0;
//        for(int ele : arr) {
//            if(ele == 0) numOf0s++;
//        }
//        for(int i = 0; i<numOf0s; i++) {
//            arr[i] = 0;
//        }
//        for(int i = numOf0s; i<n; i++) {
//            arr[i] = 1;
//        }
//
//        for(int i =0; i<n; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }

}
