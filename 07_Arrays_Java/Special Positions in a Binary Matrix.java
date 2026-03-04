// Time Complexity - O(m*n)
// Space Complexity - O(n)

class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rCount = new int[m];
        int[] cCount = new int[n];
        Arrays.fill(rCount, 0);
        Arrays.fill(cCount, 0);
        for(int  i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(mat[i][j] == 1) {
                    rCount[i]++;
                    cCount[j]++;
                }
            }
        }
        int count = 0;
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(mat[i][j] == 1 && rCount[i] == 1 && cCount[j] == 1) count++;
            }
        }
        return count;
    }
}
