class Solution {
    public static void flatten(Node root) {
        // code here
        if(root == null) return;
        Node left = root.left;
        Node right = root.right;
        root.left = null;
        root.right = left;
        flatten(left);
        Node temp = root;
        while(temp.right != null) temp = temp.right;
        temp.right = right;
        flatten(right);
    }
}

// Using Morris traversal
// Time Complexity - O(n)
// Space Complexity - O(1)
class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                // find pred
                TreeNode pred = curr.left;
                while(pred.right != null) pred = pred.right;
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
                curr = curr.right;
            }
                
            else{
                curr = curr.right;
            }
        }
        
    }
}
