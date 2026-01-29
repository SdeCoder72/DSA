
class validBST{
    int max;
    int min;
    int size;
    boolean isBST;
    validBST(int max, int min,int size, boolean isBST){
        this.max = max;
        this.min = min;
        this.size = size;
        this.isBST = isBST;
    }
}

class Solution {
    static int maxSize;
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        maxSize = 0;
        minMax(root);
        return maxSize;
        
    }
    static validBST minMax(Node root){
        if(root == null) return new validBST(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        validBST lst = minMax(root.left);
        validBST rst = minMax(root.right);
        int max = Math.max(root.data, Math.max(lst.max, rst.max));
        int min = Math.min(root.data, Math.min(lst.min, rst.min));
        int size = 1 + lst.size + rst.size;
        boolean isBST = lst.isBST && rst.isBST && lst.max < root.data && rst.min > root.data;
        if(isBST) maxSize = Math.max(maxSize, size);
        return new validBST(max, min, size, isBST);
    }
}
