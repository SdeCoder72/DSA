
class Solution {
    public TreeNode convert(int[] arr, int low, int high) {
        if(low > high) return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = convert(arr, low, mid-1);
        root.right = convert(arr, mid+1, high);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root= convert(nums, 0, nums.length-1);
        return root;
        
    }
}
