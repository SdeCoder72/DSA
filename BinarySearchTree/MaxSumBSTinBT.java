
class validBST{
    int max;
    int min;
    int sum;
    boolean isBST;
    validBST(int max, int min,int sum, boolean isBST){
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}
class Solution {
    public int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        minMax(root);
        return maxSum;
    }
    public validBST minMax(TreeNode root){
        if(root == null) return new validBST(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        validBST lst = minMax(root.left);
        validBST rst = minMax(root.right);
        int max = Math.max(root.val, Math.max(lst.max, rst.max));
        int min = Math.min(root.val, Math.min(lst.min, rst.min));
        int sum = root.val + lst.sum + rst.sum;
        boolean isBST = lst.isBST && rst.isBST && lst.max < root.val && rst.min > root.val;
        if(isBST) maxSum = Math.max(maxSum, sum);
        return new validBST(max, min, sum, isBST);
    }
}
