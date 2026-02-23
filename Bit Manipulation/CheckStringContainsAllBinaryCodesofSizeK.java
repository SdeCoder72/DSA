// Time Complexity - O(n*k)
// Space Complexity - O(n^k * k)

class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        HashSet<String> set = new HashSet<>();
        int possibility = 1<<k;
        for(int i = k; i <= n; i++){
            String str = s.substring(i-k, i);
            if(!set.contains(str)){
                set.add(str);
                possibility--;
            }
            if(possibility == 0) return true;
        }
        return false;
    }
}
