package Arrays;

public class Array_Basics {
    public static void main(String[] args) {
        // 1. creating arr
        int[] x = {4, 6, 9, 5, 3, 0};
        //indexing
       // System.out.println(x);   // not accessible
        System.out.println(x[0]);
        System.out.println(x[3]);

        // updating elements - mutable
        x[3] = 76;
        System.out.println(x[3]);

        // 2. creating array using new keyword
        int[] arr2 = new int[4];  // array of 4 size | 0 to 3

        //initializing 1 way
        arr2[0] = 10;
        arr2[1] = 10;
        arr2[2] = 10;
        arr2[3] = 10;

        System.out.println(arr2[2]);
    }
}
