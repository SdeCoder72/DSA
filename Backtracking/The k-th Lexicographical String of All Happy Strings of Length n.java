// Time Complexity - O(n*2^n)
// Space Complexity - O(n)
class Solution {
    int count;
    private String solve(StringBuilder s, int n) {
        if(s.length() == n) {
            count--;
            if(count == 0) return s.toString();
            return "";
        }
        for(char ch = 'a'; ch <= 'c'; ch++) {
            if (s.length() > 0 && s.charAt(s.length() - 1) == ch)
                continue;
            s.append(ch);
            String result = solve(s, n);
            if(!result.equals("")) return result;
        s.deleteCharAt(s.length()-1);
        }
        return "";
    }
    public String getHappyString(int n, int k) {
        count = k;
        StringBuilder s = new StringBuilder();
        return solve(s, n);
    }
}
