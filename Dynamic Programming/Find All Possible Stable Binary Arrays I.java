// Approach 1 (Recursive)
// Time Complexity - O(O * Z * K), where O is the initial count of ones and Z is the initial count of zeros
// Space Complexity - O(O * Z)
class Solution {
    int M = 1000000007;
    int[][][] t;
    int solve(int remOnes, int remZeros, int wasOne, int limit) {
        if(remOnes == 0 && remZeros == 0) return 1;
        if(t[remOnes][remZeros][wasOne] != -1) {
            return t[remOnes][remZeros][wasOne];
        }

        int result = 0;
        if(wasOne == 1) {
            for(int i = 1; i<= Math.min(remZeros, limit); i++) {
                result = (result + solve(remOnes, remZeros - i, 0, limit))%M;
            }
        }
        else {
            for(int i = 1; i<= Math.min(remOnes, limit); i++) {
                result = (result + solve(remOnes - i, remZeros, 1, limit))%M;
            }
        }

        return t[remOnes][remZeros][wasOne] = result;
    }
    public int numberOfStableArrays(int zero, int one, int limit) {
         t = new int[201][201][2];
        for(int[][] arr : t) for(int[] a : arr) Arrays.fill(a, -1);
        int startWithOne = solve(one, zero, 0, limit);
        int startWithZero = solve(one, zero, 1, limit);

        return (startWithOne + startWithZero) % M;
    }
}

// Approach 1 (DP)
// Time Complexity - O(O * Z * K), where O is the initial count of ones and Z is the initial count of zeros
// Space Complexity - O(O * Z)
class Solution {
    int[][][] t;
    int M = 1000000007;
    public int numberOfStableArrays(int zero, int one, int limit) {
        t = new int[201][201][2];
        for(int[][] arr : t) for(int[] a : arr) Arrays.fill(a, 0);

        t[0][0][0] = 1;
        t[0][0][1] = 1;

        for(int i = 0; i <= one; i++) {
            for(int j = 0; j <= zero; j++) {
                if(i == 0 && j == 0) continue;
                int result = 0;
                for(int len = 1; len <= Math.min(limit, j); len++) {
                    result = (result +  t[i][j-len][0]) % M;
                }
                t[i][j][1] = result;
                result = 0;
                for(int len = 1; len <= Math.min(limit, i); len++) {
                    result = (result + t[i-len][j][1]) % M;
                }
                t[i][j][0] = result;
                
            }
        }

        int SZero = t[one][zero][1];
        int SOne = t[one][zero][0];
        return (SZero + SOne) % M;
        
    }
}
