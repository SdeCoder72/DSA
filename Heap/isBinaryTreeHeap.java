// Time Complexity - O(n) + O(n) + O(n) = O(n), n: no. of nodes
//       methods -   size  isCBT  isMaxHeap  
// Space Complexity - O(h) h: height of tree

class Solution {
    int s;
    private int size(Node root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    private boolean isCBT(Node root, int i) {
        if(root == null) return true;
        if(i > s) return false;
        return isCBT(root.left, 2*i) && isCBT(root.right, 2*i + 1);
    }
    private boolean isMaxHeap(Node root) {
        if(root == null) return true;
        if(root.left != null && root.data <= root.left.data) return false;
        if(root.right != null && root.data <= root.right.data) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
    public boolean isHeap(Node root) {
        // code here
        s = size(root);
        return isCBT(root, 1) && isMaxHeap(root);
    }
}
