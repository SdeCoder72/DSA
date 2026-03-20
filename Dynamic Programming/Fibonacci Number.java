// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    int[] dp;
    private int fibo(int n) {
        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibo(n-1) + fibo(n-2);
    }
    public int fib(int n) {
        dp = new int[n+1];
        return fibo(n);
    }
}
