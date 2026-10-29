// Approach - 01 (Recursion + memoization)
// Time Complexity - O(n²)
// Space Complexity - O(n²)

class Solution {
    int n;
    int[][] t;
    private int child1FruitCollected(int[][] grid){
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += grid[i][i];
            t[i][i] = 0;
            grid[i][i] = 0;
        }
        return ans;
    }
    private int child2FruitCollected(int i, int j, int[][] grid){
        if(i < 0 || i >= n || j < 0 || j >= n) {
            return 0;
        }
        if(i == j || i > j) return 0;
        if(t[i][j] != -1) return t[i][j];

        int bottomLeft = grid[i][j] + child2FruitCollected(i+1, j-1, grid);
        int bottomDown = grid[i][j] + child2FruitCollected(i+1, j, grid);
        int bottomRight = grid[i][j] + child2FruitCollected(i+1, j+1, grid);

        return t[i][j] = Math.max(bottomLeft, Math.max(bottomDown, bottomRight));
    }
    private int child3FruitCollected(int i, int j, int[][] grid){
        if(i < 0 || i >= n || j < 0 || j >= n) {
            return 0;
        }
        if(i == j || i < j) return 0;
        if(t[i][j] != -1) return t[i][j];

        int rightUp = grid[i][j] + child3FruitCollected(i-1, j+1, grid);
        int right = grid[i][j] + child3FruitCollected(i, j+1, grid);
        int rightDown = grid[i][j] + child3FruitCollected(i+1, j+1, grid);

        return t[i][j] = Math.max(rightUp, Math.max(right, rightDown));
    }
    public int maxCollectedFruits(int[][] fruits) {
        n = fruits.length;
        t = new int[n][n];
        for(int[] row : t) Arrays.fill(row, -1);
        int c1 = child1FruitCollected(fruits);
        int c2 = child2FruitCollected(0, n-1, fruits);
        int c3 = child3FruitCollected(n-1, 0, fruits);

        return c1 + c2 + c3;
        
    }
}

// Approach - 02 (Bottom-up)
// Time Complexity - O(n²)
// Space Complexity - O(n²)

class Solution {
    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        int[][] t = new int [n][n];
        int result = 0;
        for (int i = 0; i < n; i++){
            result += fruits[i][i];
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j < n - 1 || i == j){
                    t[i][j] = 0;
                } else{
                    t[i][j] = fruits[i][j];
                }
            }
        }
    
        for(int i = 1; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(i+j >= n-1){
                    t[i][j] += Math.max(t[i-1][j-1], Math.max(t[i-1][j], (j+1 < n)? t[i-1][j+1] : 0));
                }
            }
        }

        for(int j = 1; j < n; j++){
            for(int i = j+1; i < n; i++){
                if(i+j >= n-1){
                    t[i][j] += Math.max(t[i-1][j-1], Math.max(t[i][j-1], (i+1 < n)? t[i+1][j-1] : 0));
                }
            }
        }
        result += t[n-2][n-1] + t[n-1][n-2];
        return result;
    }
}
