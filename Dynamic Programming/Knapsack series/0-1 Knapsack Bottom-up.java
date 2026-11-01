// Time complexity - O(n * W)
// Space complexity - O(n * W)

class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] t = new int[n+1][W+1];
        // base case - 1 (item == 0)
        for(int j = 0; j <= W; j++){
            t[0][j] = 0;
        }
        // base case - 2 (weight == 0)
        for(int i = 0; i <= n; i++){
            t[i][0] = 0;
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                int take = 0;
                
                if(wt[i-1] <= j){
                    take = val[i-1] + t[i-1][j-wt[i-1]];
                }
                int skip = t[i-1][j];
                
                t[i][j] = Math.max(take, skip);
            }
        }
        
        return t[n][W];
    }
}
