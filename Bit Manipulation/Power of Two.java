// Approach - 1 (iterative)
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n > 1) {
            if(n%2 == 1) return false;
            n = n>>1;
        }
        return true;
    }
}
// Approach - 2 (recursion)
// Time Complexity - O(log n)
// Space Complexity - O(log n)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n== 0) return false;
        if(n == 1) return true;
        if(n % 2 == 1) return false;
        return isPowerOfTwo(n/2);
    }
}

// Approach - 1 (bitwise operator)
// Time Complexity - O(1)
// Space Complexity - O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        return ((n & (n-1)) == 0);
    }
}
