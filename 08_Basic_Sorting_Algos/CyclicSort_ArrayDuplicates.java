package Basic_Sorting_Algos;

import java.util.ArrayList;
import java.util.Scanner;

public class CyclicSort_ArrayDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = findDuplicates(arr);
        System.out.println(ans);

    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int idx = arr[i] -1;
            if(arr[i] == i+1 || arr[idx] == arr[i]) i++;
            else {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(int j = 0; j<n; j++) {
            if(arr[j] != j+1) ans.add(arr[j]);
        }
        return ans;
    }
}
