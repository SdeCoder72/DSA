// Approach - 01 (Recursion + Memoization)
// T.C - O(n * 2)
// S.C - O(n * 2)

class Solution {
    int[][] t;
    private long solve(int i, boolean flag, int[] nums){
        if(i == nums.length) return 0;
        
        int f = (flag) ? 1 : 0;
        if(t[i][f] != -1) return t[i][f];
        long val = flag ? nums[i] : -nums[i];
        long take = val + solve(i+1, !flag, nums);
        long skip = solve(i+1, flag, nums);

        t[i][f] = (int) Math.max(take, skip);
        return Math.max(take, skip);
    }
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        t = new int[n+1][2];
        for(int[] row : t) {
            Arrays.fill(row, -1);
        }

        return solve(0, true, nums);
        
    }
}

// Approach - 02 (Bottom-up)
// T.C - O(n * 2)
// S.C - O(n * 2)
