// Approach 1: Using Map (O(n) Space)
// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    Map<Integer, Integer> mp = new TreeMap<>();
    void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        mp.put(root.val, mp.getOrDefault(root.val, 0)+1);
        dfs(root.right);
    }
    public int[] findMode(TreeNode root) {
        dfs(root);
        int maxFreq = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                ans.clear();
                ans.add(num);
            }
            else if(maxFreq == freq){
                ans.add(num);
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}

// Approach 2: O(1) Extra Space (Follow-up)
// Time Complexity - O(n)
// Space Complexity - O(1)

