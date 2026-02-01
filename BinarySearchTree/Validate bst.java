class Solution {
    public long min= Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean l = isValidBST(root.left);
        if(min >= root.val) return false;
        else min= root.val;
        boolean r= isValidBST(root.right);
        return l && r;
    }
}

// Morris traversal

class Solution {
    public boolean isValidBST(TreeNode root) {
        
        long prev = Long.MIN_VALUE;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                // find pred
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }

                if(pred.right == null){ // link
                 pred.right = curr;
                 curr = curr.left;
                }
                else{ // unlink
                    pred.right = null;
                    if(curr.val <= prev) return false;
                    prev = curr.val;
                    curr = curr.right;
                }
            }
            else{
                if(curr.val <= prev) return false;
                prev = curr.val;
                curr = curr.right;
            }
        }
        return true;
    }
}
