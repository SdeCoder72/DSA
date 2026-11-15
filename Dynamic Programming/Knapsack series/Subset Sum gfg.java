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
