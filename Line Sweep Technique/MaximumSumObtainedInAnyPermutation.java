// Time Complexity - O(n log n + Q) = O(n log n)  n-nums.length,  Q-request
// Space Complexity - O(n)  frequency array

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n = nums.length;
        long M = 1000000007;
        int [] events = new int[n];
        for(int[] r : requests){
            int start = r[0];
            int end = r[1];
            events[start]++;
            if(end < n-1) events[end+1]--;
        }
        // cumSum
        for(int i = 1; i<n; i++){
            events[i] += events[i-1];
        }
        Arrays.sort(nums);
        Arrays.sort(events);
        
        long ans = 0;
        for(int i = n-1; i>=0; i--){
            if(events[i] == 0) break;
            ans = (ans + (long)events[i] * nums[i]) % M;
        }
        return (int)ans;
    }
}
