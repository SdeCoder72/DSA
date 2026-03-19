// Time Complexity - O(1)
// Space Complexity - O(1)

class Solution {
    private static int xor(int n) {
        if(n % 4 == 0) return n;
        else if(n % 4 == 1) return 1;
        else if(n % 4 == 2) return n+1;
        return 0;
    }
    public static int findXOR(int l, int r) {
        return xor(l-1) ^ xor(r);
    }
}
