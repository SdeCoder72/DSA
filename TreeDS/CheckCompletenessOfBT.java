// BFS (level order)
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean past = false;
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode top = q.remove();
            if(top == null) past = true;
            else if(past == true) return false;
            if(top!= null) q.add(top.left);
            if(top!= null) q.add(top.right);
        }
        return true;
    }
}

//DFS (pre order)

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public boolean dfs(TreeNode root, int i, int totalNodes) {
        if(root == null) return true;
        if(i > totalNodes) return false;
        return dfs(root.left, 2*i, totalNodes) && dfs(root.right, 2*i+1, totalNodes);
    }
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        int i = 1;
        return dfs(root, i, totalNodes);
    }
}
