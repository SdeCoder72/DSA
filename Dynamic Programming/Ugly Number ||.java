// Time complexity - O(n)
// Space complexity - O(n)
class Solution {
    public int nthUglyNumber(int n) {
        int[] ans = new int[n+1];
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;

        ans[1] = 1;
        for(int i = 2; i<=n; i++) {
            int i2Num = ans[i2] * 2;
            int i3Num = ans[i3] * 3;
            int i5Num = ans[i5] * 5;

            int minUglyNum = Math.min(i2Num, Math.min(i3Num, i5Num));
            ans[i] = minUglyNum;
            
            if(minUglyNum == i2Num) i2++;
            if(minUglyNum == i3Num) i3++;
            if(minUglyNum == i5Num) i5++;
        }
        return ans[n];
    }
}
