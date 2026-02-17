// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> ans = new ArrayList<>();
        for(int h = 0; h<=11; h++) {
            for(int m = 0; m<=59; m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    String hour = String.valueOf(h);
                    String min = (m < 10 ? "0" : "") + String.valueOf(m);
                    ans.add(hour + ":" + min);
                }
            }
        }
        return ans;
    }
}
