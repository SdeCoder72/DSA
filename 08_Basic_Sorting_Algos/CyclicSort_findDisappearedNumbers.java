package Basic_Sorting_Algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CyclicSort_findDisappearedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findDisappearedNumbers(arr));

    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int n = arr.length;
        while(i < n) {
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[i] == arr[idx]) i++;
            else {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        for(i = 0; i<n; i++) {
            if(arr[i] != i+1) ans.add(i+1);
        }
        return ans;
    }
}
