// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    int[] t;
    private int thief(int i, int n, int[] nums) {
        if(i >= n) return 0;
        if(t[i] != -1) return t[i];
        int pick = nums[i] + thief(i+2, n, nums);
        int skip = thief(i+1, n, nums);
        return t[i] = Math.max(pick, skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        t = new int[n+1];
        Arrays.fill(t, -1);
        int take1thIndex = thief(1, n, nums);
        Arrays.fill(t, -1);
        int take0thIndex = thief(0, n-1, nums);
        return Math.max(take1thIndex, take0thIndex);
    }
}
