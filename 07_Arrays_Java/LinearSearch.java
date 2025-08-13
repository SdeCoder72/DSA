package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to Search in Array: ");
        int x = sc.nextInt();
        System.out.print("Enter the length of arr: ");
        int n = sc.nextInt();
        System.out.print("Enter arr elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;
        for(int i = 0; i<n; i++) {
            if(arr[i] == x) {
                index = i;
                break;
            }
        }
        if(index != -1)System.out.println(x + " exists in array at index " + index);
        else System.out.println(x + " does not exists in array");
    }
}
