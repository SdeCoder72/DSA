// Approach - 01 (Recursion memoization)
// Time complexity - O(n*target)
// Space complexity - O(n*target)

class Solution {
    static int[][] t;
    static int solve(int n, int target, int[] arr){
        if(n == 0) {
            return target == 0 ? 1 : 0;
        }
        
        if(t[n][target] != -1) return t[n][target];
        
        int skip = solve(n-1, target, arr);
        int take = 0;
        if(arr[n-1] <= target){
            take = solve(n-1, target - arr[n-1], arr);
        }
        return t[n][target] = take + skip;
    }
    static int perfectSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        t = new int[n+1][target+1];
        for(int[] row : t) Arrays.fill(row, -1);
        return solve(n, target, arr);
    }
}
