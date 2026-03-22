// Recursion + memoization
// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    int[] t;
    private int minCost(int i, int[] cost) {
        if(i >= cost.length) return 0;
        if(t[i] != -1) return t[i];
        return t[i] = cost[i] + Math.min(minCost(i+1, cost), minCost(i+2, cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        t = new int[n];
        Arrays.fill(t, -1);
        return Math.min(minCost(0, cost), minCost(1, cost));
    }
}

// Tabulation (Iterative)
// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] t = new int[n];
        t[0] = cost[0];
        t[1] = cost[1];
        for(int i = 2; i<n; i++) {
            t[i] = cost[i] + Math.min(t[i-1], t[i-2]);
        }
        return Math.min(t[n-1], t[n-2]);
    }
}
