static int productOfNonZeroInBT(Node root) {
        if(root == null) return 1;
        if(root.data != 0)return root.data*productOfNonZeroInBT(root.left)*productOfNonZeroInBT(root.right);
        else return productOfNonZeroInBT(root.left)*productOfNonZeroInBT(root.right);
}
