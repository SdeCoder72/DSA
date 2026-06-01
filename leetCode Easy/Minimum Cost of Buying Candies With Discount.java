// Approach 01 - Counting method 
// Time complexity - O(n log n)
// Space complexity - O(1)

class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        int minCost = 0;
        Arrays.sort(cost);
        int c = 1;
        for(int i = n-1; i >= 0; i--){
            if(c%3 != 0)
                minCost += cost[i];
            c++;
        }
        return minCost;
    }
}


// Approach 02 - Iteration skipping method 
// Time complexity - O(n log n)
// Space complexity - O(1)

class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        if (n == 1) return cost[0];
        if(n == 2) return cost[0] + cost[1];
        int minCost = 0;
        Arrays.sort(cost);
        for(int i = n-1; i >= 0; i=i-3){
            minCost += cost[i];
            if(i-1 >= 0) minCost += cost[i-1];
        }
        return minCost;
    }
}
