// Approach - 01 (Recursion + Memoization)
// Time Complexity - O(n * (maxJump - minJump))
// Space complexity - O(n) - Boolean array + recursion stack

class Solution {
    private boolean solve(int i, String s, int min, int max, Boolean[] t){
        if(i == s.length()-1) return true;
        if(t[i] != null) return t[i];
        for(int jump = min; jump<=max; jump++){
            int j = i + jump;
            if(j >= s.length()) break;
            if(s.charAt(j) == '0' && solve(j, s, min, max, t)== true){
                return t[i] = true;
            }
        }
        return t[i] = false;
    }
    public boolean canReach(String s, int minJump, int maxJump) {
        Boolean[] t = new Boolean[s.length()];
        return solve(0, s, minJump, maxJump,t);
    }
}

// Approach - 02 (Bottom up)
// Time Complexity - O(n * (maxJump - minJump))
// Space complexity - O(n)

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] t = new boolean[n];
        t[n-1] = true;
        for(int i = n-2; i>=0; i--){
            for(int jump = minJump; jump <= maxJump; jump++){
                int j = i+jump;
                if(j >= n) break;
                if(s.charAt(j) == '0' && t[j]) {
                    t[i] = true;
                    break;
                }
            }
        }
        return t[0];
    }
}

// Approach - 03 (Sliding window)
// Time Complexity - O(n)
// Space complexity - O(n)

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();

        int[] t = new int[n];

        t[0] = 1;
        int count = 0;

        for (int j = 1; j <= n - 1; j++) {
            if (j - minJump >= 0) {
                count += t[j - minJump];
            }

            if (j - maxJump - 1 >= 0) {
                count -= t[j - maxJump - 1];
            }

            if (count > 0 && s.charAt(j) == '0') {
                t[j] = 1;
            }
        }

        return t[n - 1] > 0;
    }
}
