class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        int count = 0;
        TreeNode temp;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size; i++) {
                    temp = q.remove();
                    if(count%2 == 0) {
                        level.add(temp.val);
                    }
                    else level.add(0, temp.val);
                    if(temp.left != null) q.add(temp.left);
                    if(temp.right != null) q.add(temp.right); 
            }
            count++;
            ans.add(level);
        }
        return ans;
    }
}
