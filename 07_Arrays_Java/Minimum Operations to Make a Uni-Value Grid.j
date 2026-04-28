// Time complexity - O(N log N)  : N = m*n
// Space complexity - O(N)

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] nums = new int[m * n];
        int k = 0;
        
        // Flatten the 2D grid into a 1D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[k++] = grid[i][j];
            }
        }
        
        // Sort the array to find the median
        Arrays.sort(nums);
        
        // The median is the optimal value to minimize absolute differences
        int target = nums[(m * n) / 2];
        int result = 0;
        
        for (int num : nums) {
            // Check if the difference is reachable by steps of x
            if (Math.abs(target - num) % x != 0) {
                return -1;
            }
            
            // Add the number of operations needed for this element
            result += Math.abs(target - num) / x;
        }
        
        return result;
    }
}
