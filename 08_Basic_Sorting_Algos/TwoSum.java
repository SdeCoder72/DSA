package Basic_Sorting_Algos;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        boolean flag = false;
        int i = 0, j = n-1;
        while(i < j) {
            if(arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                flag = true;
                break;
            }
            else if(arr[i] + arr[j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        if(flag) System.out.println("Numbers are present");
        else System.out.println("Numbers are not present");

    }
}
