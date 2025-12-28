// using binary search (Time Complexity - O(n log n);

public int binarySearch(int[] arr) {
        int n = arr.length;
        int low = 0; 
        int high = n-1;
        int mid;
        while(low <= high) {
            mid = low +(high-low)/2;
            if(arr[mid] >= 0) low = mid+1;
            else high = mid-1;
        }
        int ans = n - low;
        return ans;
    }
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        for(int i = 0; i<n; i++) {
            ans += binarySearch(grid[i]);
        }
        return ans;
    }

// optimal Approach (Time Complexity - O(m+n)
public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = m-1;
        int col = 0;
        int ans = 0;
        while(row >= 0 && col < n) {
            if(grid[row][col] >= 0) col++;
            else {
                ans += (n-col);
                row--;
            }
        }
        return ans;
    }
