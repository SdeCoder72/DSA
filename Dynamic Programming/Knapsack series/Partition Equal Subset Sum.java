// Approach - 01 (Recursion memoization)
// Time complexity - O(n * sum)
// Space complexity - O(n * sum)

class Solution {
    Boolean[][] t;
    private boolean solve(int n, int sum, int[] nums){
        if(sum == 0) return true;
        if(n == 0) return false;
        if(t[n][sum] != null) return t[n][sum];
        boolean skip = solve(n-1, sum, nums);
        boolean take = false;
        if(nums[n-1] <= sum) {
            take = solve(n-1, sum - nums[n-1], nums);
        }
        return t[n][sum] = take || skip;
    }
    public boolean canPartition(int[] nums) {
        int n  = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0) return false;
        t = new Boolean[n+1][sum/2+1];
        return solve(n, sum/2, nums);
    }
}

// Approach - 01 (Bottom-up)
// Time complexity - O(n * sum)
// Space complexity - O(n * sum)

class Solution {
    public boolean canPartition(int[] nums) {
        int n  = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0) return false;
        int s = sum/2;
        boolean[][] t = new boolean[n+1][s + 1];
        for(int i = 0; i <= n; i++){
            t[i][0] = true;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= s; j++) {
                boolean skip = t[i-1][j];
                boolean take = false;
                if(nums[i-1] <= j){
                    take = t[i-1][j - nums[i-1]];
                }
                t[i][j] = take || skip;
            }
        }
        return t[n][s];
    }
}
