class Solution {
    int idx = 0;
    TreeNode solve(int[] preorder, int[] inorder, int start, int end) {
        if(start > end) return null;
        int rootVal = preorder[idx];
        int i = start;
        for(; i<= end; i++) {
            if(inorder[i] == rootVal) break;
        }
        idx = idx+1;
        TreeNode root = new TreeNode(rootVal);
        root.left = solve(preorder, inorder, start, i-1);
        root.right = solve(preorder, inorder, i+1, end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        
        TreeNode ans = solve(preorder, inorder, 0, n-1);
        return ans;
    }
}
