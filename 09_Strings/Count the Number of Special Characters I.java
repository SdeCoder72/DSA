// Time complexity - O(n)
// Space complexity - O(1)

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int [123];
        int result = 0;
        for(char ch : word.toCharArray()){
            freq[ch]++;
            if(ch >= 'a' && ch <= 'z'){
                char upper = (char) (ch - 'a' +'A');
                if(freq[ch] == 1 && freq[upper] > 0) result++;
            }
            else{
                char lower = (char)(ch - 'A' + 'a');
                if(freq[ch] == 1 && freq[lower] > 0) result++;
            }
        }
        return result;
    }
}
