class Solution {
    public static int findMax(Node root) {
        // code here
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(findMax(root.right), findMax(root.left)));
    }

    public static int findMin(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(findMin(root.right), findMin(root.left)));
    }
}
