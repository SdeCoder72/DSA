class Solution {
    public boolean isMagicGrid(int[][] grid, int r, int c){
        // checking for distict elements
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                int num = grid[r+i][c+j];
                if(num < 1 || num > 9 || set.contains(num)) return false;
                set.add(num);
            }
        }

        int Sum = grid[r][c] + grid[r][c+1] + grid[r][c+2];

        // checking Rows and columns = Sum or not
        for(int i = 0; i<3; i++ ) {
            // Rows check
            if(grid[r+i][c] + grid[r+i][c+1] + grid[r+i][c+2] != Sum) return false;
            // Cols check
            if(grid[r][c+i] + grid[r+1][c+i] + grid[r+2][c+i] != Sum) return false;
            // Diagonal check
            if(grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2] != Sum) return false;
            // Anti-diagonal
            if(grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c] != Sum) return false;

        }
        return true;

    }
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if(rows < 3 || cols < 3) return 0;
        int count = 0;
        for(int i = 0; i<= rows-3; i++) {
            for(int j = 0; j<= cols-3; j++) {
                if(isMagicGrid(grid, i , j)){
                    count++;
                }
            }
        }
        return count;
    }
}
