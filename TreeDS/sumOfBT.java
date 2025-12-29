public static int getSum(Node root) {
        // code here
        return (root == null)? 0:root.data+getSize(root.left) + getSize(root.right);
    }
