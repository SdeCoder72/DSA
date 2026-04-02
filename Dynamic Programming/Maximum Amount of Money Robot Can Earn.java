class Solution {
    int[][][] dp;
    private int solve(int i, int j, int n, int[][] coins) {
        if(i == coins.length-1 && j == coins[0].length-1) {
            if(coins[i][j] < 0 && n > 0) return 0;
            return coins[i][j];
        }
        if(i >= coins.length || j >= coins[0].length) {
            return Integer.MIN_VALUE;
        }
        if(dp[i][j][n] != Integer.MIN_VALUE) return dp[i][j][n];
        int take = coins[i][j] + Math.max(solve(i, j+1, n, coins), solve(i+1, j, n, coins));
        int skip = Integer.MIN_VALUE;
        if(coins[i][j] < 0 && n > 0) {
            skip = Math.max(solve(i+1, j, n-1, coins), solve(i, j+1, n-1, coins));
        }
        return dp[i][j][n] = Math.max(take, skip);
    }
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        dp = new int[m][n][3];
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++){
                for(int k = 0; k<3; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }
        return solve(0, 0, 2, coins);
    }
}
