class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i = 0; i < s.length(); i++){
            char e = s.charAt(i);
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        char ans = 'z';
        int freq = 0;
        for(char ch : map.keySet()){
            int currFreq = map.get(ch);
            if(freq < currFreq){
                freq = currFreq;
                ans = ch;
            }
            else if(freq == currFreq && ch < ans) ans = ch;
        }
        return ans;
    }
}
