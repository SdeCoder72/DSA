class Solution {
    public TreeNode helper(TreeNode root,Set<Integer> st, List<TreeNode> ans) {
        if(root == null) return null;
        root.left = helper(root.left, st, ans);
        root.right = helper(root.right, st,ans);
        // process root value
        if(st.contains(root.val)) {
            if(root.left != null) ans.add(root.left);
            if(root.right != null) ans.add(root.right);
            return null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int e : to_delete) {
            st.add(e);
        }
        root = helper(root, st, ans);
        if(root != null) {
            ans.add(root);
        }
        return ans;
        
    }
}
