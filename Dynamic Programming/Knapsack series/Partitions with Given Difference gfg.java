// Approach - 01 (Recursion + memoization)
// Time-complexity - O(n * d)
// Space-complexity - O(n * d)

class Solution {
    int[][] t;
    private int solve(int n, int d, int[] arr) {
        if(n == 0) {
            return d == 0 ? 1 : 0;
        }
        
        if(t[n][d] != -1) return t[n][d];
        
        int skip = solve(n-1, d, arr);
        int take = 0;
        if(arr[n-1] <= d) {
            take = solve(n-1, d - arr[n-1], arr);
        }
        return t[n][d] = take + skip;
    }
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        if(sum - diff < 0 || (sum-diff) % 2 != 0) return 0;
        int d = (sum - diff) / 2;
        
        t = new int[n+1][d+1];
        for(int[] row : t) Arrays.fill(row, -1);
        
        return solve(n, d, arr);
    }
}

// Approach - 02 (Bottom-up)
// Time-complexity - O(n * d)
// Space-complexity - O(n * d)

class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        
        if(sum - diff < 0 || (sum - diff) % 2 != 0) return 0;
        
        int d = (sum - diff) / 2;
        
        int[][] t = new int[n+1][d+1];
        
        t[0][0] = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= d; j++) {
                int skip = t[i-1][j];
                int take = 0;
                if(arr[i-1] <= j) {
                    take = t[i-1][j - arr[i-1]];
                }
                
                t[i][j] = skip + take;
            }
        }
        return t[n][d];
    }
}

// Approach - 03 (Bottom-up + Space optimised)
// Time-complexity - O(n * d)
// Space-complexity - O(d)

class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        
        if(sum - diff < 0 || (sum - diff) % 2 != 0) return 0;
        
        int d = (sum - diff) / 2;
        
        // int[][] t = new int[n+1][d+1];
        int[] curr = new int[d+1];
        int[] prev = new int[d+1];
        prev[0] = 1;
        
        // t[0][0] = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= d; j++) {
                int skip = prev[j];
                int take = 0;
                if(arr[i-1] <= j) {
                    take = prev[j - arr[i-1]];
                }
                
                curr[j] = skip + take;
            }
            prev = curr.clone();
        }
        return prev[d];
    }
}
