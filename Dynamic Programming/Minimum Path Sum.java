// Tabulation
// Time Complexity - O(n)
// Space Complexity - O(1) : in-place

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        //int[][] t = new int[m][n];  // if not in-place
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                //t[i][j] = grid[i][j];
                if(i-1 >= 0 && j-1 >=0) grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                else if(i-1 >= 0) 
                    grid[i][j] += grid[i-1][j];
                else if(j-1 >= 0)
                    grid[i][j] += grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}
