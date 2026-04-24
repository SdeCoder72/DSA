// Time complexity - O(n)
// Space complexity - O(1)

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int result = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R'){
                result += 1;
                n--;
            }
            else if(ch == 'L'){
                result -= 1;
                n--;
            }
        }
        return Math.abs(result) + n;
    }
}
