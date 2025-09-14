package Recursion;

import java.util.Scanner;


public class SubsetSum {
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: " );
        int n = sc.nextInt();
        System.out.print("Enter the elements of arr: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the subset's sum: ");
        int sum = sc.nextInt();

//        List<Integer> list = new ArrayList<>();
        flag = false;
        subsetSum(arr, 0, 0, sum);
        System.out.println(flag);
    }
    public static void subsetSum(int[] arr, int i, int ts, int sum) {

        if(ts == sum) {
            flag = true;
            return;
        }
        if(i == arr.length) return;

        subsetSum(arr, i+1, ts+arr[i], sum);
        subsetSum(arr, i+1, ts, sum);
    }

}
