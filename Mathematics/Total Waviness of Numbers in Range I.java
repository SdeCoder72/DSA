// Time complexity - O(num2-num1) * O(log10 num)
// Space complexity - O(num)

class Solution {
    private int findWave(int num){
        String s = Integer.toString(num);
        int n = s.length();
        int score = 0;
        if(n < 3) return 0;
        for(int i = 1; i< n-1; i++){
            if(s.charAt(i) > s.charAt(i-1) && s.charAt(i) > s.charAt(i+1)) score++;
            if(s.charAt(i) < s.charAt(i-1) && s.charAt(i) < s.charAt(i+1)) score++;
        }
        return score;
    }
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        for(int i= num1; i<=num2; i++){
            result += findWave(i);
        }
        return result;
    }
}
