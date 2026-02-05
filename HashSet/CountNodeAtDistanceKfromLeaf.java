// Approach - 1 Brute force 
// Time Complexity - O(n * h)  n = traversal, h = depth of the leaf
// Space Complexity - O(n * h)

class Solution {
    List<List<Node>> paths = new ArrayList<>();
    void solve(Node root, List<Node> temp){
        if(root == null) return;
        temp.add(root);
        if(root.left == null && root.right == null){
            paths.add(new ArrayList<>(temp));
        }
        solve(root.left, temp);
        solve(root.right, temp);
        temp.remove(temp.size()-1);
    }
    int kthFromLeaf(Node root, int k) {
        // code here
        List<Node> temp = new ArrayList<>();
        HashSet<Node> result = new HashSet<>();
        solve(root, temp);
        for(int i = 0; i < paths.size(); i++){
            List<Node> path = paths.get(i);
            int n = path.size();
            if(n > k){
                result.add(path.get(n-k-1));
            }
        }
        return result.size();
    }
}
