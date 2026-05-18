// Time complexity - O(n)
// Space complexity - O(n)

class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        boolean[] visited = new boolean[n];
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for( int i = 0; i< n; i++){
            mp.putIfAbsent(arr[i], new ArrayList<>());
            mp.get(arr[i]).add(i);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int top = q.poll();
                int l = top-1;
                int r = top+1;
                if(top == n-1) return steps;
                if(l >= 0 && !visited[l]){
                    q.offer(l);
                    visited[l] = true;
                }
                if(r < n && !visited[r]){
                    q.offer(r);
                    visited[r] = true;
                }
                if(mp.containsKey(arr[top])){
                    for(int idx : mp.get(arr[top])){
                    if(!visited[idx]){
                        q.offer(idx);
                        visited[idx] = true;
                    }
                    }
                    mp.remove(arr[top]);
                }
                
            }
            steps++;
        }
        return steps;
    }
}
