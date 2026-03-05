// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int start_0 = 0;
        for(int i = 0; i<n; i++) {
            if(i % 2 == 0) {
                if(s.charAt(i) == '1') start_0++;
            }else {
                if(s.charAt(i) == '0') start_0++;
            }
        }
        return Math.min(start_0, n-start_0);
    }
}
