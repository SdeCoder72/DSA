package Arrays;

import java.util.Scanner;

public class InputAndOutput_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr2 = new int[7];
        //default values
//        for(int i = 0; i<arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();

        //input
        for(int i = 0; i<arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        //print
        for(int i= 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // multiply by 2
        for(int i= 0; i < arr2.length; i++) {
            System.out.print(arr2[i]*2 + " ");
        }

        //printing
//        int[] arr = {5, -9, 5, 8, -98, 43, 65, 3};
//        int n = arr.length;
//        for(int i = 0; i<n; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);



    }
}
