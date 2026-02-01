class Tree {
    // Function to return a list containing the inorder traversal of the BST
    void inorder(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
        
    }
}

// Morris Traversal
// Time Complexity - O(n)
//Space Complexity - O(1)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
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
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}
