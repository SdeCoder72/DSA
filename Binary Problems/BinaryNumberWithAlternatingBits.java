// Approach - 1: Using Integer.toBinaryString()
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public boolean hasAlternatingBits(int n) {
        String b = Integer.toBinaryString(n);
        for(int i = 0; i<b.length()-1; i++) {
            if(b.charAt(i) == b.charAt(i+1)) return false;
        }
        return true;
    }
}

// Approach - 2: Division method
// Time Complexity - O(log n)
// Space Complexity - O(1)
class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit = n%2;
        n = n/2;
        while(n != 0) {
            if(n % 2 == bit) return false;
            bit = n % 2;
            n/=2;
        }
        return true;
    }
}

// Approach - 3: Using 
// Time Complexity - O(1)
// Space Complexity - O(1)
class Solution {
    public boolean hasAlternatingBits(int n) {
        int ans = n ^ (n>>1);
        return (ans & ans +1) == 0;
        
    }
}
