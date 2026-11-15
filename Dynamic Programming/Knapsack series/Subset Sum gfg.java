// Approach - 01 (Recursion+ memoization)
// Time complexity - O(n *sum)
// Space complexity - O(n * sum)

class Solution {
   static Boolean[][] t;
    static boolean solve(int n, int sum, int[] arr){
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(t[n][sum] != null) return t[n][sum];
        boolean skip = solve(n-1, sum, arr);
        boolean take = false;
        if(arr[n-1] <= sum){
            take = solve(n-1, sum - arr[n-1], arr);
        }
        return t[n][sum] = skip || take;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        t = new Boolean[n+1][sum+1];
        return solve(n, sum, arr);
    }
}

// Approach - 01 (Bottom-up)
// Time complexity - O(n *sum)
// Space complexity - O(n * sum)

class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        boolean[][] t = new boolean[n+1][sum+1];
            
        for(int i = 0; i <= n; i++){
            t[i][0] = true;
        }
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= sum; j++){
                boolean skip = t[i-1][j];
                boolean take = false;
                if(arr[i-1] <= j){
                    take = t[i-1][j - arr[i-1]];
                }
                t[i][j] = take || skip;
            }
        }
        return t[n][sum];
    }
}

// Approach - 01 (Bottom-up + space optimised)
// Time complexity - O(n *sum)
// Space complexity - O(sum)

class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        //boolean[][] t = new boolean[n+1][sum+1];
        boolean[] prev = new boolean[sum+1];
        boolean[] curr = new boolean[sum+1];
        prev[0] = true;
        curr[0] = true;
            
        //for(int i = 0; i <= n; i++){
        //    t[i][0] = true;
        //}
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= sum; j++){
                boolean skip = prev[j];
                boolean take = false;
                if(arr[i-1] <= j){
                    take = prev[j - arr[i-1]];
                }
                curr[j] = take || skip;
            }
            prev = curr.clone();
        }
        return prev[sum];
    }
}
