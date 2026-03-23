// Time Complexity - O(m*n)
// Space Complexity - O(1)

class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(matrix[i][j] == 0) continue;
                if(i-1 >= 0 && j-1 >= 0) {
                    int min = Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                    matrix[i][j] += min;
                    count += matrix[i][j];
                }
                else count++;
            }
        }
        return count;
    }
}
