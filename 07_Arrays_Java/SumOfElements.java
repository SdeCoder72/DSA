package Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array size: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
