// Time Complexity - O(n²)
// Space Complexity - O(n)

class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid[0].length;
        int[] trailingZeros = new int[n];
        for(int i = 0; i<n; i++) {
            int count = 0;
            for(int j = n-1; j>=0; j--) {
                if(grid[i][j] == 0) 
                    count++;
                else break;
            }
            trailingZeros[i] = count;
        }

        int swaps = 0;
        for(int i = 0; i<n; i++) {
            int need = n-i-1;
            int j;
            for(j = i; j<n; j++) {
                if(trailingZeros[j] >= need){
                    swaps += (j-i);
                    break;
                }
            }
            if(j == n) return -1;
            else {
                while(j > i){
                    int temp = trailingZeros[j];
                   trailingZeros[j] = trailingZeros[--j];
                   trailingZeros[j] = temp;
                }
            }
        }
        return swaps;
    }
}
