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
