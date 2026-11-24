// Approach 01 (Recursion)
// Time complexity - O(2^n)
// Space complexity - O(n)

class Solution {
    private boolean hasDuplicate(String s1, String s2) {
        int[] alphabets = new int[26];
        for(char ch : s1.toCharArray()) {
            if(alphabets[ch - 'a'] > 0) return true;
            alphabets[ch - 'a']++;
        }
        for(char ch : s2.toCharArray()) {
            if(alphabets[ch - 'a'] > 0) return true;
        }
        return false;
    }
    private int solve(int i, String temp, int n, List<String> arr) {
        if(i == n) return temp.length();

        int include = 0;
        int exclude = 0;
        exclude = solve(i+1, temp, n, arr);
        if(!hasDuplicate(arr.get(i), temp)) {
            include = solve(i+1, temp+arr.get(i), n, arr);
        }
        return Math.max(include, exclude);
    }
    public int maxLength(List<String> arr) {
        int n = arr.size();
        return solve(0, "", n, arr);
        
    }
}

// Approach 02 (Recursion + memoization)
// Time complexity - O(n * L)  L = maximum length string
// Space complexity - O(n * L)

class Solution {
    Map<String, Integer> t;
    private boolean hasDuplicate(String s1, String s2) {
        int[] alphabets = new int[26];
        for(char ch : s1.toCharArray()) {
            if(alphabets[ch - 'a'] > 0) return true;
            alphabets[ch - 'a']++;
        }
        for(char ch : s2.toCharArray()) {
            if(alphabets[ch - 'a'] > 0) return true;
        }
        return false;
    }
    private int solve(int i, String temp, int n, List<String> arr) {
        if(i == n) return temp.length();
        if(t.containsKey(temp)) return t.get(temp);
        
        int include = 0;
        int exclude = 0;
        exclude = solve(i+1, temp, n, arr);
        if(!hasDuplicate(arr.get(i), temp)) {
            include = solve(i+1, temp+arr.get(i), n, arr);
        }
        int result = Math.max(include, exclude);
        t.put(temp, result);
        return Math.max(include, exclude);
    }
    public int maxLength(List<String> arr) {
        int n = arr.size();
        t = new HashMap<>();
        return solve(0, "", n, arr);
        
    }
}
