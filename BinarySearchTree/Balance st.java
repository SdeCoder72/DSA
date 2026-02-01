// Time Complexity - O(n + n) -> O(n)
// Space Complexity - O(n)
class Solution {
    public void inOrder(TreeNode root, ArrayList<Integer> ans){
        if(root == null) return;
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
    public TreeNode construct(int l, int r, ArrayList<Integer> ans){
        if(l>r) return null;
        int mid = l+(r-l)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = construct(l, mid-1, ans);
        root.right = construct(mid+1, r, ans);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        int l = 0;
        int r = ans.size() - 1;
        return construct(l, r, ans);
    }
}
