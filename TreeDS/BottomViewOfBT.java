// Time Complexity - O(n)
// Space Complexity - O(n)

class Pair{
    Node node;
    int dist;
    Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair top = q.remove();
            Node node = top.node;
            int dist = top.dist;
            minDist = Math.min(minDist, dist);
            maxDist = Math.max(maxDist, dist);
            map.put(dist, node.data);
            if(node.left != null) q.add(new Pair(node.left, dist-1));
            if(node.right != null) q.add(new Pair(node.right, dist+1));
        }
        for(int i = minDist; i <= maxDist; i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
