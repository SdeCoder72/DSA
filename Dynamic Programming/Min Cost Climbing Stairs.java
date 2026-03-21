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
