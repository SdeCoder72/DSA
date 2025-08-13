package Arrays;

import java.util.Arrays;

public class SortArrayBuiltInMethod {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = {4, 2, 5, 2, 8, 4, 9,-3, 10};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
