// Time complexity - O(m+n)
// Space complexity - O(1)

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int m = landStartTime.length;
        int n = waterStartTime.length;
        int minLand = 5000;
        int minWater = 5000;
        int result= 5000;
        for(int i = 0; i < m; i++){
            minLand = Math.min(minLand, landStartTime[i] + landDuration[i]);
        }
        for(int i = 0; i < n; i++){
            minWater = Math.min(minWater, waterStartTime[i] + waterDuration[i]);
            result = Math.min(result, Math.max(minLand, waterStartTime[i]) + waterDuration[i]);
        }
        for(int i = 0; i<m; i++){
            result = Math.min(result, Math.max(minWater, landStartTime[i]) + landDuration[i]);
        }
        return result;
    }
}
