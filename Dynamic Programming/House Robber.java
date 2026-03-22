// Recursion + Memoization
// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    int[] dp;
    private int maxMoney(int i, int[] arr) {
        if(i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = arr[i] + maxMoney(i+2, arr);
        int skip = maxMoney(i+1, arr);
        return dp[i] = Math.max(pick, skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return maxMoney(0, nums);
    }
}

// Tabulation (Iterative)
// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] t = new int[n];
        t[0] = nums[0];
        t[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i<n; i++) {
            t[i] = Math.max(nums[i] + t[i-2], t[i-1]);
        }
        return t[n-1];
    }
}
