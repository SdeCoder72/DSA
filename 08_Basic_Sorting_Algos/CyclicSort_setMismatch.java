package Basic_Sorting_Algos;

import java.util.Scanner;

public class CyclicSort_setMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = findErrorNums(arr);
        for(int ele : ans) {
            System.out.print(ele + " ");
        }


    }
    public static int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[i] == arr[idx]) i++;
            else {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        int k = 0;
        for(i = 0; i<n; i++) {
            if(arr[i] != i+1) {
                ans[k++] = arr[i];
                ans[k] = i+1;
            }
        }

        return ans;
    }
}
