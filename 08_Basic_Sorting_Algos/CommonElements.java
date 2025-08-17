package Basic_Sorting_Algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the 1st array: ");
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2st array: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.print("Enter the elements of the 2nd array: ");
        for(int i = 0; i<m; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i < n && j < m) {
            if(a[i] == b[j]) {
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] > b[j]) j++;
            else i++;
        }

        for(int ele : arr) System.out.print(ele + " ");
    }
}
