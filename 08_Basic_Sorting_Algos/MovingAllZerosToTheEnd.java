package Basic_Sorting_Algos;

import java.util.Scanner;

public class MovingAllZerosToTheEnd {
    public static void print(int[] arr){
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);

        //move all zeros to the end. TC: O(n2)

//        for(int i=0; i < n-1; i++){
//            int swap = 0;
//            for(int j = 0; j < n-1-i; j++) {
//                if(arr[j] == 0) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swap++;
//                }
//            }
//            if(swap == 0) break;
//        }
//        print(arr);

        // alternative approach - move all zeros T.C: O(n), A.S : O(n);

        int j=0;
        for(int i = 0; i<n; i++) {
            if(arr[i] != 0) {
                if(i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        print(arr);
    }
}
