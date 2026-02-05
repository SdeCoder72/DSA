// Time Complexity - O(n + k)   where n = s.length, k = map.size() 
// worst case - all unique letters k = n
// Space Complexity - O(n)

class Sol {
    long equalPairs(String s) {
        // your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        long ans = 0;
        for(char k : map.keySet()){
            int freq = map.get(k);
            ans += (long)(freq * freq);
        }
        return ans;
    }
}
