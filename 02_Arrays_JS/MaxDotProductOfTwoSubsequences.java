class Solution {
    int n, m;
    int[][] t;
   int solve(int[] nums1, int[] nums2, int i, int j) {
        if(i == m || j == n) return -1000000000;
        if(t[i][j] != -1000000000) {
            return t[i][j];
        }
        int val = nums1[i] * nums2[j];
        int increment_i_j =  val + solve(nums1, nums2, i+1, j+1);
        int increment_j = solve(nums1, nums2, i, j+1);
        int increment_i = solve(nums1, nums2, i+1, j);
        return t[i][j] = Math.max(val, Math.max(increment_i_j, Math.max(increment_i, increment_j)));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        m = nums1.length;
        n = nums2.length;
        t = new int[m][n];

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                t[i][j] = -1000000000;
            }
        }
        return solve(nums1, nums2,0,0);
    }
}
