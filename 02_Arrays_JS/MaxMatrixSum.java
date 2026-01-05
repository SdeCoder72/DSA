class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long sum = 0;
        int negativeCount = 0;
        int smallVal = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                sum += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0) negativeCount++;
                smallVal = Math.min(smallVal, Math.abs(matrix[i][j]));
            }
        }
        if(negativeCount%2 != 0) {
            return sum - (2*smallVal);
        }
        return sum;
    }
}
