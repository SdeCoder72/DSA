// Approach - 01 Recursion + memoization) from i to n-1
// Time complexity - O(n * W)
// Space complexity - O(n * W)

class Solution {
    int n;
    int[][] t;
    private int solve(int i, int W, int val[], int wt[]){
        if(i >= n || W == 0) return 0;
        if(t[i][W] != -1) return t[i][W];
        int take = 0;
        int skip = 0;
        if(wt[i] <= W){
            take = val[i] + solve(i+1, W - wt[i], val, wt);
        }
        skip = solve(i+1, W, val, wt);
        return t[i][W] = Math.max(take, skip);
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        n = val.length;
        t = new int[1001][1001];
        for(int[] row : t) Arrays.fill(row, -1);
        return solve(0, W, val, wt);
    }
}

// Approach - 02 Recursion + memoization) from n-1 to 0
// Time complexity - O(n * W)
// Space complexity - O(n * W)

class Solution {
    int n;
    int[][] t;
    private int solve(int n, int W, int val[], int wt[]){
        if(n == 0 || W == 0) return 0;
        if(t[n-1][W] != -1) return t[n-1][W];
        int take = 0;
        int skip = 0;
        if(wt[n-1] <= W){
            take = val[n-1] + solve(n-1, W - wt[n-1], val, wt);
        }
        skip = solve(n-1, W, val, wt);
        return t[n-1][W] = Math.max(take, skip);
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        n = val.length;
        t = new int[1001][1001];
        for(int[] row : t) Arrays.fill(row, -1);
        return solve(n, W, val, wt);
    }
}
