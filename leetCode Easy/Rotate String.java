// Approach - 01
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(m != n) return false;
        for(int i = 0; i<n; i++){
            s = s.substring(1)+s.charAt(0);
            if(s.equals(goal)) return true;
        }
        return false;
    }
}

// Approach - 02
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(m != n || !(s+s).contains(goal)) return false;
        
        return true;
    }
}
