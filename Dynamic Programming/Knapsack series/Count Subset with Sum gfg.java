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

// Approach - 02 (Bottom-up)
// Time complexity - O(n*target)
// Space complexity - O(n*target)

class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int[][] t = new int[n+1][target+1];
        t[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= target; j++) {
                int skip = t[i-1][target];
                int take = 0; 
                if(arr[i-1] <= j) {
                    take = t[i-1][j - arr[i-1]];
                }
                
                t[i][j] = take + skip;
            }
        }
        return t[n][target];
    }
}

// Approach - 03 (Bottom-up + Space optimised)
// Time complexity - O(n*target)
// Space complexity - O(target)

class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int[] curr = new int[target+1];
        int[] prev = new int[target+1];
        prev[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= target; j++) {
                int skip = prev[j];
                int take = 0; 
                if(arr[i-1] <= j) {
                    take = prev[j - arr[i-1]];
                }
                
                curr[j] = take + skip;
            }
            prev = curr.clone();
        }
        return prev[target];
    }
}
