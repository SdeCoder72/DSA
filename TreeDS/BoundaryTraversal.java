// Using loop
class Solution {
    void leftBoundary(Node root, ArrayList<Integer> ans) {
        while(root != null) {
            if(root.left == null && root.right == null) break;
            ans.add(root.data);
            if(root.left != null) root = root.left;
            else root = root.right;
        }
    }
    void leafNode(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null) ans.add(root.data);
        leafNode(root.left, ans);
        leafNode(root.right, ans);
    }
    void rightBoundary(Node root, ArrayList<Integer> ans) {
        ArrayList<Integer> temp = new ArrayList<>();
        while(root != null) {
            if(root.left == null && root.right == null) break;
            temp.add(root.data);
            if(root.right != null) root = root.right;
            else root = root.left;
        }
        for(int i = temp.size()-1; i>=0; i--) {
            ans.add(temp.get(i));
        }
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left == null && root.right == null) return ans;
        leftBoundary(root.left, ans);
        leafNode(root, ans);
        rightBoundary(root.right, ans);
        return ans;
    }
}

// Using Recursion
class Solution {
    void leftBoundary(Node root, ArrayList<Integer> ans) {
        if(root == null || root.left == null && root.right == null) return;
        ans.add(root.data);
        if(root.left != null) leftBoundary(root.left, ans);
        else leftBoundary(root.right, ans);
    }
    void leafNode(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null) ans.add(root.data);
        leafNode(root.left, ans);
        leafNode(root.right, ans);
    }
    void rightBoundary(Node root, ArrayList<Integer> ans) {
        if(root == null || root.left == null && root.right == null) return;
        if(root.right != null) rightBoundary(root.right, ans);
        else rightBoundary(root.left, ans);
        ans.add(root.data);
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left == null && root.right == null) return ans;
        leftBoundary(root.left, ans);
        leafNode(root, ans);
        rightBoundary(root.right, ans);
        return ans;
    }
}
