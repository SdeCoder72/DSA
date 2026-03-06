// Approach - 01 (Traversing the string)
// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        for(int i = n-1; i>0; i--) {
            if(s.charAt(i) == '1' && s.charAt(i-1) == '0')
                return false;
        }
        return true;
    }
}

// Approach - 02 (Built-in method)
// Time Complexity - O(n)
// Space Complexity - O(1)
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
