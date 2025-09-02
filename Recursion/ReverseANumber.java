package Recursion;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int ans = 0;
        int res = reverse(n, ans);
        System.out.println(res);
    }
    public static int reverse(int n, int ans) {
        if(n==0) return ans;

        int rem = n%10;
        ans = ans * 10 +rem;
        return reverse(n/10, ans);
    }
}
