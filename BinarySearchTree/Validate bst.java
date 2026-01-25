class Solution {
    public long min= Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean l = isValidBST(root.left);
        if(min >= root.val) return false;
        else min= root.val;
        boolean r= isValidBST(root.right);
        return l && r;
    }
}
