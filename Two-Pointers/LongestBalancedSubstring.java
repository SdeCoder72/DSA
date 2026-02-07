// Time Complexity - O(n² + 26) = O(n²)
// Space Complexity - O(1)

class Solution {
    private boolean balanced(int[] freq){
        int identical = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                if(identical == 0) identical = freq[i];
                else if(identical != freq[i]) return false;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i<n; i++){
            int[] freq = new int[26];
            for(int j = i; j< n; j++){
                freq[s.charAt(j) - 'a']++;
                if(balanced(freq)) maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
}
