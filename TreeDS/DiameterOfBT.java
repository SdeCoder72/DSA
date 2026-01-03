class Solution {
    public int result = 0;
    public int solve(TreeNode root){
        if(root == null) return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        result = Math.max(result, l+r);
        return Math.max(l, r) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        solve(root);
        return result;
    }
}
