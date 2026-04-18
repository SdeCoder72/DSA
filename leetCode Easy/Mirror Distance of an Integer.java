// Time complexity - O(log 10 n)
// Space complexity - O(1)

class Solution {
    private int reverse(int n){
        int reverseNum = 0;
        while (n!= 0){
            int digit = n%10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        return reverseNum;
    }
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(n - rev);
    }
}
