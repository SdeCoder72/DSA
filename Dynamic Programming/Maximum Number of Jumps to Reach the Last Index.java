// Time complexity - O(n²)
// Space complexity - O(n)

public class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] t = new int[n+1];
        Arrays.fill(t, Integer.MIN_VALUE);
        
        int result = solve(0, nums, target, t);
        return result < 0 ? -1 : result;
    }

    private int solve(int i, int[] nums, int target, int[] t) {
        if (i == nums.length - 1) return t[i] = 0;
        if (t[i] != Integer.MIN_VALUE) return t[i];

        int result = Integer.MIN_VALUE;
        for (int j = i + 1; j < nums.length; j++) {
            if (Math.abs(nums[i] - nums[j]) <= target) {
                int temp = 1+solve(j, nums, target, t);
                
                result = Math.max(result,temp);
                
            }
        }
        return t[i] = result;
    }
}
