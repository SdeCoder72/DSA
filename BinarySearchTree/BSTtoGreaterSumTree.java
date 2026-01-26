//T.C - O(n)
// A.S - O(h)
//leetCode 
class Solution {
    int sum = 0;
    public void solve(TreeNode root){
        if(root == null) return;
        solve(root.right);
        sum += root.val;
        root.val = sum;
        solve(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        solve(root);
        return root;
    }
}

// gfg
class Solution {
    public static int sum;
    public static void solve(Node root){
        if(root == null) return;
        solve(root.right);
        int val = root.data;
        root.data = sum;
        sum += val;
        solve(root.left);
    }

    public static void transformTree(Node root) {
        // code here
        sum = 0;
        solve(root);
        
    }
}
    
