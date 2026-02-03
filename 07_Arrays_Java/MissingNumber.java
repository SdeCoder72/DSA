package Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = missingNumber(arr);
        System.out.println(res);
    }
    public static int missingNumber(int[] arr) {
        long n = arr.length +1;
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for(int ele : arr) {
            arrSum += ele;
        }
        return (int)(sum-arrSum);
    }
}

// Missing number (leetCode)
// Brute force 
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] - nums[i] != 1) return nums[i] +1;
        }
        if(nums[0] <= 0) return nums.length;
        return nums[0]-1;
    }
}

// Optimization 
class Solution {
    public int missingNumber(int[] nums) {
        int excsum=0;
        for (int i =0;i<=nums.length;i++){
            excsum+=i;
        }
        int acsum=0;
        for(int i=0; i<nums.length;i++){
            acsum+=nums[i];
        }
        return excsum-acsum;
        
    }
            }

