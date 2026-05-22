// Time complexity - O(log n)
// Space complexity - O(1)

class Solution {
    int pivot(int[] nums, int n){
        int l = 0;
        int r = n-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid+1;
            }
            else r = mid;
        }
        return r;
    }
    int binarySearch(int l, int r, int[] nums, int t){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == t) return mid;
            if(nums[mid] > t) r = mid-1;
            else l = mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot_idx = pivot(nums, n);
        int ans = binarySearch(0, pivot_idx-1, nums, target);
        if(ans != -1) return ans;
        ans = binarySearch(pivot_idx, n-1, nums, target);
        return ans;
    }
}
