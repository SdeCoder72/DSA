// Time complexity - O(n)
// Space complexity - O(n)

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        Map<Integer, Long> idxSum = new HashMap<>();
        Map<Integer, Long> numFreq = new HashMap<>();

        // Forward Pass
        for (int i = 0; i < n; i++) {
            long freq = numFreq.getOrDefault(nums[i], 0L);
            long sum = idxSum.getOrDefault(nums[i], 0L);
            
            result[i] = (freq * i) - sum;
            
            idxSum.put(nums[i], sum + i);
            numFreq.put(nums[i], freq + 1);
        }

        idxSum.clear();
        numFreq.clear();

        // Backward Pass
        for (int i = n - 1; i >= 0; i--) {
            long freq = numFreq.getOrDefault(nums[i], 0L);
            long sum = idxSum.getOrDefault(nums[i], 0L);
            
            result[i] += sum - (freq * i);
            
            numFreq.put(nums[i], freq + 1);
            idxSum.put(nums[i], sum + i);
        }

        return result;
    }
}
