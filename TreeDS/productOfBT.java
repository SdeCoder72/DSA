public static int getProduct(Node root) {
        return (root == null)? 1:root.data*getSize(root.left) * getSize(root.right);
    }
