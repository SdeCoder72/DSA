// Time Complexity - O(n)
// Space Complexity - O(n)

class Solution {
    int[] t;
    public int climbStairs(int n) {
        t = new int[n+1];
        Arrays.fill(t, -1);
        return climb(n);
    }
    private int climb(int n) {
        if(n <= 2) return n;
        if(t[n] != -1) return t[n];
        return t[n] = climb(n-1) + climb(n-2);
    }
}

// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    int[] t;
    public int climbStairs(int n) {
        t = new int[n+1];
        Arrays.fill(t, -1);
        return climb(0, n);
    }
    private int climb(int i, int n) {
        if(i == n-1) return 1;
        if(i == n-2) return 2;
        if(i >= n) return 0;
        if(t[i] != -1) return t[i];
        return t[i] = climb(i+1, n) + climb(i+2, n);
    }
}
