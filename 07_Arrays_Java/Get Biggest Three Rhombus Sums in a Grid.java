// Approach - 1
// Time Complexity - O(m*n* min(m,n)²)
// Space Complexity - O(1)

class Solution {
    private int[] convertSetToInt(TreeSet<Integer> st) {
        int[] result = new int[st.size()];
        int idx = st.size() -1;
        for(Integer ele : st) {
            result[idx--] = ele;
        }
        return result;
    }
    public int[] getBiggestThree(int[][] grid) {
        TreeSet<Integer> st = new TreeSet<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int row = 0; row < m; row++) {
            for(int col = 0; col<n; col++) {
                st.add(grid[row][col]);
                if(st.size() > 3) st.pollFirst();
                for(int side = 1; row-side >= 0 && row+side < m && col - side >= 0 && col + side < n; side++) {
                    int sum = 0;
                    for(int k = 0; k<side; k++) {
                        sum += grid[row-side+k][col-k];
                        sum += grid[row+k][col-side+k];
                        sum += grid[row+side-k][col+k];
                        sum += grid[row-k][col+side-k];
                    }
                    st.add(sum);
                    if(st.size() > 3) st.pollFirst();
                }
            }
        }
        return convertSetToInt(st);
    }
}

// Approach - 2
// Time Complexity - O(m*n* min(m,n))
// Space Complexity - O(1)
class Solution {
    private int[] convertSetToInt(TreeSet<Integer> st) {
        int[] result = new int[st.size()];
        int idx = st.size() - 1;
        for (Integer ele : st) {
            result[idx--] = ele;
        }
        return result;
    }

    public int[] getBiggestThree(int[][] grid) {
        TreeSet<Integer> st = new TreeSet<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] d1 = new int[m][n];
        int [][] d2 = new int[m][n];
        for(int i = 0; i<m; i++) {
            for(int j= 0; j<n; j++) {
                d1[i][j] = grid[i][j];
                if(i-1 >= 0 && j-1 >= 0) {
                    d1[i][j] += d1[i-1][j-1];
                }
                d2[i][j] = grid[i][j];
                if(i-1 >= 0 && j+1 < n) {
                    d2[i][j] += d2[i-1][j+1];
                }
            }
        }
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                st.add(grid[row][col]);
                if (st.size() > 3)
                    st.pollFirst();
                for (int side = 1; row - side >= 0 && row + side < m && col - side >= 0 && col + side < n; side++) {
                    int sum = 0;
                    // Vertices
                    int top_r = row-side, top_c = col;
                    int bottom_r = row+side, bottom_c = col;
                    int left_r = row, left_c = col-side;
                    int right_r = row, right_c = col+side;

                    // Top -> left
                    sum += d2[left_r][left_c];
                    if(top_r-1 >= 0 && top_c+1 < n) {
                        sum -= d2[top_r-1][top_c+1];
                    }
                    // left -> bottom
                    sum += d1[bottom_r][bottom_c];
                    if(left_r-1 >= 0 && left_c-1 >= 0) {
                        sum -= d1[left_r-1][left_c-1];
                    }
                    // bottom -> right
                    sum += d2[bottom_r][bottom_c];
                    if(right_r-1 >= 0 && right_c+1 < n) {
                        sum -= d2[right_r-1][right_c+1];
                    }
                    // right -> top
                    sum += d1[right_r][right_c];
                    if(top_r-1 >= 0 && top_c-1 >= 0) {
                        sum -= d1[top_r-1][top_c-1];
                    }
                    sum -= grid[top_r][top_c];
                    sum -= grid[bottom_r][bottom_c];
                    sum -= grid[left_r][left_c];
                    sum -= grid[right_r][right_c];

                    st.add(sum);
                    if (st.size() > 3)
                        st.pollFirst();
                }
            }
        }
        return convertSetToInt(st);
    }
}
