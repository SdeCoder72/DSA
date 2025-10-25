package Basic_Sorting_Algos;

import java.util.Scanner;

public class CyclicSort_DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i < n) {

            if(arr[i] == i+1) i++;
            else {
                int idx = arr[i] -1;
                if(arr[i] == arr[idx]) return arr[i];
                else {
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }

            }
        }
        return -1;
    }
}
