// Time Complexity - O(n)
// Space Complexity - O(h) recursion stack 
class Solution {
    int sum(TreeNode root, int val){
        if(root == null) return 0;
        val = (2*val) + root.val;
        if(root.left == null && root.right == null) return val;
        return sum(root.left, val) + sum(root.right, val);
    }
    public int sumRootToLeaf(TreeNode root) {
        return sum(root, 0);
    }
}
