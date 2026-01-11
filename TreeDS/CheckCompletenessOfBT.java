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
