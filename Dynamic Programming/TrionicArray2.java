class Solution {
    private long[][] memo;
    private int n;
    private long MIN_VAL = Long.MIN_VALUE/2; 
    public long maxSumTrionic(int[] nums) {
        n = nums.length;
        memo = new long[n+1][4];
        for(long[] row : memo){
            Arrays.fill(row, Long.MIN_VALUE);
        }

        return solve(0,0,nums);
        
    }
    private long solve(int i, int trend, int[] nums){
        if(i == n){
            return (trend == 3) ? 0 : MIN_VAL;
        }

        if(memo[i][trend] != Long.MIN_VALUE) return memo[i][trend];

        long take = MIN_VAL;
        long skip = MIN_VAL;

        //skip
            if(trend == 0) skip = solve(i+1, 0, nums);
        // end
            if(trend == 3) take = nums[i];

        if(i+1 < n){
            int curr = nums[i];
            int next = nums[i+1];
            // case 1
            if(trend == 0 && next > curr){
                take = Math.max(take, curr+solve(i+1, 1, nums));
            }
            else if(trend == 1){
                if(next > curr){
                    take = Math.max(take, curr+solve(i+1, 1, nums));
                }
                else if(next < curr){
                    take = Math.max(take, curr+solve(i+1, 2, nums));
                }
            }
            else if(trend == 2){
                if(next < curr){
                    take = Math.max(take, curr+solve(i+1, 2, nums));
                }
                else if(next > curr){
                    take = Math.max(take, curr+solve(i+1, 3, nums));
                }
            }
            else if(trend == 3 && next > curr){
                take = Math.max(take, curr+solve(i+1, 3, nums));
            } 
        }
        
        return memo[i][trend] = Math.max(take, skip);
    }
}
