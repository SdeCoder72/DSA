package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] y = Arrays.copyOf(arr, arr.length); // deep copy
        //deep copy 2
        int[] brr = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            brr[i] = arr[i];
        }
        print(arr);
        print(y);
        print(brr);
        int[] x = arr;  // x is shallow copy of arr
        System.out.println(arr[0]);
        System.out.println(y[0]);
        x[0] = 46;
        y[0] = 99;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
    public static void print(int[] arr) {
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
