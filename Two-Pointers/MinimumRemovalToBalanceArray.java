class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int maxL = 1;
        for(int j = 0; j < n; j++){
            while(nums[j] > (long)k*nums[i]) i++;
            maxL = Math.max(maxL, j-i+1);
        }
        return n - maxL;
    }
}
