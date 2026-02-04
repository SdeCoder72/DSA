// Time Complexity - O(m + n)
// Space Complexity - O(n)

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)-1);
            if(map.get(ch) < 0) return false;
            else if(map.get(ch) == 0) map.remove(ch);
        }
        return (!map.isEmpty()) ? false : true;
    }
}
