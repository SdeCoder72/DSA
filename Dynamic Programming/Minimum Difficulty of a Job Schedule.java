// Time complexity - O(n*d)
// Space complexity - O(n*d)

class Solution {
    int[][] t;
    private int solve(int idx, int d, int n, int[] jd){
        // Base case - if only 1 day left, have to do all the work in same day
        if(d == 1) {
            int maxD = jd[idx];
            for(int i = idx; i < n; i++) {
                maxD = Math.max(maxD, jd[i]);
            }
            return maxD;
        }

        if(t[idx][d] != -1) return t[idx][d];

        int maxD = jd[idx];
        int finalAns = Integer.MAX_VALUE;
        for(int i = idx; i <= n-d; i++) {
            maxD = Math.max(maxD, jd[i]);
            int result = maxD + solve(i+1, d-1, n, jd);
            finalAns = Math.min(finalAns, result);
        }
        return t[idx][d] = finalAns;
    }
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if(n < d) return -1;
        t = new int[n+1][d+1];
        for(int[] row : t) Arrays.fill(row, -1);
        return solve(0, d, n, jobDifficulty);
    }
}
