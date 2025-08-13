package Arrays;

import java.util.Scanner;

public class ForEach {
    // For Each loop use to traverse the data structure
    // Cannot modify the original one
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: ");
        int n = sc.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //printing
        for(int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
        // can not modify the original one (makes a copy of DS)
        System.out.println("Trying to modify the array using ForEach loop ");
        for(int ele : arr) {
            ele *= 2;
        }
        //printing
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // using regular for loop
        System.out.println("Trying to modify the array using ForEach loop ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] *= 2;
        }
        //printing
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
