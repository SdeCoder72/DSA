// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int idx = (nums[i]+i) % n;
            if(idx < 0) idx = idx + n;
            
            ans[i] = nums[idx];
        }
        return ans;
    }
}
