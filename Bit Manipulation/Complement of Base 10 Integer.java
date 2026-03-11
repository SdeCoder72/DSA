// Approach 1 (Mathematical formula)
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int k = 1;
        int sum = 0;
        while(n > 0) {
            sum += (n%2 == 0) ? 1 * k : 0 * k;
            k *= 2;
            n /= 2;
        }
        return sum;
    }
}

// Approach 2 (Iterative Bitmask Building)
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public int bitwiseComplement(int n) {
        int mask = 1;
        while(mask < n) 
            mask = (big << 1) | 1;
        
        return mask ^ n;
    }
}

// Approach 3 (Logarithmic Mask Calculation)
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public int bitwiseComplement(int n) {
        int bit = (int)(Math.log(n) / Math.log(2)) + 1;
        int mask = (1 << bit) - 1;
        return mask ^ n;
    }
}

// Approach 4 (Follow up of approach 3)
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public int bitwiseComplement(int n) {
        int bit = (n==0) ? 1 : 32 - Integer.numberOfLeadingZeros(n);
        int mask = (1 << bit) - 1;
        return mask ^ n;
    }
}
