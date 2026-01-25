
class Solution {
    public int minDiff=Integer.MAX_VALUE;
    private int prev = Integer.MAX_VALUE;  
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        
        if (prev!= Integer.MAX_VALUE) minDiff = Math.min(minDiff, root.val - prev);
        prev = root.val;
 
        inOrder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
        
    }
}
