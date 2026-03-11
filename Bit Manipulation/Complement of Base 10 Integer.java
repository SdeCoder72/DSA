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
