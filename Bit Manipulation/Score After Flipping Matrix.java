// Time Complexity - O(m*n)
// Space Complexity - O(1)

class Solution {
    void flip(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxScore = 0;
        for(int i = 0; i<m; i++) {
            if(grid[i][0] == 0)
                flip(grid[i]);
        }
        for(int col = 0; col<n; col++) {
            int zerosCount = 0;
            for(int row = 0; row < m; row++) {
                if(grid[row][col] == 0) zerosCount++;
            }
            if(zerosCount > m-zerosCount) {
                for(int row = 0; row <m; row++) {
                    grid[row][col] = (grid[row][col] == 0)? 1 : 0;
                }
            }
        }
        int power = 1;
        for(int j = n-1; j>=0; j--) {
            int count = 0;
            for(int i = 0; i<m; i++) {
                if(grid[i][j] == 1) count++;
            }
            maxScore += (count * power);
            power = power << 1;
        }
        return maxScore;
    }
}
