class Solution {
    public static void dfs(Node root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr) {
        if(root == null) return;
        arr.add(root.data);
        if(root.left == null && root.right == null) {
            // new array
            ArrayList<Integer> level = new ArrayList<>();
            for(int e:arr) level.add(e);
            ans.add(level);
        } 
        dfs(root.left, ans, arr);
        dfs(root.right, ans, arr);
        arr.remove(arr.size()-1);
    } 
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, ans, arr);
        return ans;
    }
}
