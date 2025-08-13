package Arrays;

import java.util.Scanner;
import java.util.Vector;

public class AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int carry = 1;
        Vector<Integer> ans = new Vector<>();
        for(int i = n-1; i>=0; i--) {
            if(arr[i]+carry >= 10) {
                ans.add(0);
                carry = 1;
            }
            else {
                ans.add(arr[i]+carry);
                carry = 0;
            }
        }
        if(carry == 1) {
            ans.add(1);
        }
        System.out.println(ans.reversed());
    }
}
