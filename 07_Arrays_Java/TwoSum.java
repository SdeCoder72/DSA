package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        //brute force approach TLE
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 3, 9, 4, -2};
        int target = sc.nextInt();
        boolean res = twoSum(arr, target);
        if(res) System.out.println("Found");
        else System.out.println("Not found");

    }
    public static boolean twoSum(int[] arr, int x){
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                if(arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " + "+ arr[j] + " = " + x);
                    return true;
                }
            }
        }
        return false;
    }

}
