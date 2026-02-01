class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] < fmin){
                smin = fmin;
                fmin = nums[i];
            }
            else if(nums[i] < smin){
                smin = nums[i];
            }
        }
        return sum+fmin+smin;
    }
}
