// Time complexity - O(m+n)
// Space complexity - O(1)

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int result = 0;
        while (i<n && j<m) {
            if (nums1[i] > nums2[j]) i++;
            else {
                result = Math.max(result, j-i);
                j++;
            }
        }
        return result;
    }
}
