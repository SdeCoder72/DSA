// Time Complexity - O(n)
// Space Complexity - O(h)

class Solution {
    static int idx;
    static void inOrder(Node root, ArrayList<Integer> arr) {
        if(root == null) return;
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }
    static void postOrder(Node root, ArrayList<Integer> arr) {
        if(root == null) return;
        postOrder(root.left, arr);
        postOrder(root.right, arr);
        root.data = arr.get(idx++); 
    }
    public static void convertToMaxHeapUtil(Node root) {
        // code here
        idx = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        postOrder(root, arr);
    }
}
