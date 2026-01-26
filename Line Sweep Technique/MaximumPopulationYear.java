
// Approach-1. Difference Array Technique(DAT)
//T.C : O(n)
//S.C : O(max year) diffArr size
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diffArr = new int[2051];
        for(int[] log : logs){
            int start = log[0];
            int end = log[1];

            diffArr[start] += 1;
            diffArr[end] -= 1;
        }
        int maxPop = 0;
        int currPop = 0;
        int minYear = 2050;
        for(int i=1950; i<2051; i++){
            currPop += diffArr[i];
            if(currPop > maxPop){
                maxPop = currPop;
                minYear = i;
            }
        }
        return minYear;
    }
}
