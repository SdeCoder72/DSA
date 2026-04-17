// Time complexity - O(n (log10n))
// Space complexity - O(n)

class Solution {
    public int reverse(int n) {
        int reverseNum = 0;
        while (n != 0) {
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n /= 10;
        }
        return reverseNum;
    }

    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Check if the current number is the reverse of a previously seen number
            if (mp.containsKey(nums[i])) {
                result = Math.min(result, i - mp.get(nums[i]));
            }
            
            mp.put(reverse(nums[i]), i);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
