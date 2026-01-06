class Solution {
    public int maxLevelSum(TreeNode root) {
        int level = 1; 
        int ansLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int n = q.size();
            int sum = 0;
            for(int i = 0; i<n; i++) {
                TreeNode top = q.remove();
                sum += top.val;
                if(top.left != null) q.add(top.left);
                if(top.right != null) q.add(top.right);

            }
            if(sum > maxSum) {
                ansLevel = level;
                maxSum = sum;
            }
            level++;
        }
        return ansLevel;
    }
}
