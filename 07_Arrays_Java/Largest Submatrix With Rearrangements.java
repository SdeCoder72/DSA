// Time Complexity - O(m*n)
// Space Complexity - O(n)

class Solution {
    int maxRec(int[] height) {
        int n = height.length;
        int[] arr = height.clone();
        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i<n; i++) {
            int base = i+1;
            int h = arr[n-i-1];
            result = Math.max(result, base*h);
        }
        return result;
    }
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;
        int[] height = new int[n];
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(matrix[i][j] == 0) height[j] = 0;
                else height[j] += 1;
            }
            maxArea = Math.max(maxArea, maxRec(height));
        }
        return maxArea;
    }
}
