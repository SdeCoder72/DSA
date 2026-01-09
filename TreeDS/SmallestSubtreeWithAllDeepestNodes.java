
class Solution {
    public Map<Integer, Integer> mp = new HashMap<>();
    public int maxD = 0;
    public void depth(TreeNode root, int d) {
        if(root == null) return;
        mp.put(root.val, d);
        maxD = Math.max(maxD, d);
        depth(root.left, d+1);
        depth(root.right, d+1);
    }
    public TreeNode lca(TreeNode root) {
        if(root == null || mp.get(root.val) == maxD) return root;

        TreeNode l = lca(root.left);
        TreeNode r = lca(root.right);
        if(l != null && r != null) return root;
        if(l != null) return l;
        return r;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth(root, 0);
        return lca(root);
    }
}

// 1-pass solution


class Solution {
    class Pair{
        int depth;
        TreeNode node;
        Pair(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }
    public Pair solve(TreeNode root) {
        if(root == null) return new Pair(0, null);

        Pair l = solve(root.left);
        Pair r = solve(root.right);
        if(l.depth == r.depth) return new Pair(l.depth + 1, root);
        return (l.depth > r.depth)? new Pair(l.depth+1, l.node) : new Pair(r.depth+1, r.node);
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return solve(root).node;
    }
}
