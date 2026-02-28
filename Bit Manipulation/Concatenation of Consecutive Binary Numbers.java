// Approach - 1
// Time Complexity - O(n)
// Space Complexity - O(1)
class Solution {
    public int M = 1000000007;
    public int concatenatedBinary(int n) {
        long ans = 0;
        int digit = 0;
        for(int num = 1; num <= n; num++) {
            if((num & (num-1)) == 0) digit++;
            ans = ((ans << digit)%M + num) % M;
        }
        return (int)ans;
    }
}

// Approach - 2
// Time Complexity - O(n)
// Space Complexity - O(1)
class Solution {
    public int M = 1000000007;
    public int concatenatedBinary(int n) {
        long ans = 0;
        int digit = 0;
        for(int num = 1; num <= n; num++) {
            if(num == Math.pow(2,digit)) digit++;
            ans = ((ans << digit)%M + num) % M;
        }
        return (int)ans;
    }
}
