// Approach - 01 (Recursion, Brute force) Accepted
// Time complexity - O(2^n)
// Space complexity - O(n) system stack

class Solution {
    private int solve(int n, int sum, int target, int[] nums){
        if(n == 0) {
            return sum == target ? 1 : 0;
        }

        int positive = solve(n-1, sum + nums[n-1], target, nums);
        int negative = solve(n-1, sum - nums[n-1], target, nums);
        return positive + negative;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return solve(n, 0, target, nums);
    }
}


// Approach - 02 (Recursion memoization) 
// Time complexity - O(n * s)
// Space complexity - O(n * s)

class Solution {
    int[][] t;
    private int solve(int n, int s, int[] nums){
        if(n == 0) {
            return s == 0 ? 1 : 0;
        }

        if(t[n][s] != -1) return t[n][s];
        
        int skip = solve(n-1, s, nums);
        int take = 0;
        if(nums[n-1] <= s) {
            take = solve(n-1, s - nums[n-1], nums);
        }
        return t[n][s] = take + skip;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        target = Math.abs(target);
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if((sum+target) % 2 != 0) return 0;
        int s = (sum + target) / 2;
        t = new int[n+1][s+1];
        for(int[] row : t) Arrays.fill(row, -1);
        return solve(n, s, nums);
    }
}


// Approach - 03 (Bottom-up) 
// Time complexity - O(n * s)
// Space complexity - O(n * s)

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        target = Math.abs(target);
        if((sum + target) % 2 != 0) return 0;
        int s = (sum + target)/2;
        int[][] t = new int[n+1][s+1];
        t[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= s; j++) {
                int skip = t[i-1][j];
                int take = 0;
                if(nums[i-1] <= j) {
                    take = t[i-1][j - nums[i-1]];
                }

                t[i][j] = take + skip;
            }
        }
        return t[n][s];
    }
}

// Approach - 04 (Bottom-up + Space optimised) 
// Time complexity - O(n * s)
// Space complexity - O(n)

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        target = Math.abs(target);
        if((sum + target) % 2 != 0) return 0;
        int s = (sum + target)/2;
        // int[][] t = new int[n+1][s+1];

        int[] curr = new int[s+1];
        int[] prev = new int[s+1];
        prev[0] = 1;
        // t[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= s; j++) {
                int skip = prev[j];
                int take = 0;
                if(nums[i-1] <= j) {
                    take = prev[j - nums[i-1]];
                }

                curr[j] = take + skip;
            }
            prev = curr.clone();
        }
        return prev[s];
    }
}
