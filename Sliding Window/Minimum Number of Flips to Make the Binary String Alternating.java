// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int flip1 = 0;
        int flip2 = 0;
        int ans = Integer.MAX_VALUE;
        int i = 0, j = 0;
        char s1, s2;
        while(j < 2*n) {
            s1 = j % 2 == 0 ? '0':'1';
            s2 = j%2 == 0? '1':'0';
            if(s.charAt(j%n) == s1) flip1++;
            else flip2++;

            if(j - i + 1 > n) {
                s1 = i%2==0? '0':'1';
                s2 = i%2==0? '1':'0';
                if(s.charAt(i) == s1) flip1--;
                else flip2--;
                i++;
            }
            if(j - i + 1 == n) {
                ans = Math.min(ans, Math.min(flip1, flip2));
                
            }
            j++;
        }
        return ans;
    }
}
