// BFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i = 0; i<n; i++) {
                TreeNode top = q.remove();
                if(i == 0) ans.add(top.val);
                if(top.left != null) q.add(top.left);
                if(top.right != null) q.add(top.right);
            }
        }
        return ans;
    }
}

// DFS

class Solution {
    void dfs(TreeNode root, List<Integer> ans, int lvl) {
        if(root == null) return ;
        if(ans.size() < lvl) ans.add(root.val);
        dfs(root.left, ans, lvl+1);
        dfs(root.right, ans, lvl+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans, 1);
        return ans;
        
    }
}
