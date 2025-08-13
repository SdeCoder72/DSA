package Arrays;

import java.util.Scanner;
import java.util.Vector;

public class AddTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the 1st array: ");
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the size of 2nd array: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.print("Enter the elements of the 2nd array: ");
        for(int i = 0; i<m; i++) {
            b[i] = sc.nextInt();
        }

        int i = n-1;
        int j = m-1;
        Vector<Integer> ans = new Vector<>();
        int carry = 0;

        while(i >= 0 && j >= 0) {
            int sum = a[i] + b[j] + carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            i--;
            j--;

        }
        while(i >= 0) {
            int sum = a[i] + carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            i--;
        }
        while (j >= 0) {
            int sum = b[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;
        }
        System.out.println(ans);
        System.out.println(ans.reversed());
    }
}
