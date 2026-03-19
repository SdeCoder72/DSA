// Time Complexity - O(1)
// Space Complexity - O(1)

class Solution {
    boolean isPowerOfTwo(int n) {
        return ((n & (n-1)) == 0);
    }
    boolean isPerfectSquare(int n) {
        int root = (int)(Math.sqrt(n));
        return (n == root*root);
    }
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        return isPowerOfTwo(n) && isPerfectSquare(n);
    }
}
