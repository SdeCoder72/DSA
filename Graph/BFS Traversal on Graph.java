// Time complexity - O(V+E)  V = vertices, E = edges
// Space complexity - O(V)

import java.util.*;
class Main {
    private static void bfs(Map<Integer, List<Integer>> adj, int u, List<Integer> result, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(u);
        visited[u] = true;
        result.add(u);

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for(int v : adj.getOrDefault(node, Collections.emptyList())) {
                if(!visited[v]){
                    queue.offer(v);
                    visited[v] = true;
                    result.add(v);
                }
            }
        }
    }
    public static List<Integer> bfsOfGraph(int V, List<List<Integer>> arr) {
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for(int u = 0; u < V; u++) {
            adj.put(u, new ArrayList<>(arr.get(u)));
        }

        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        bfs(adj, 0, result, visited);
        return result;
    }
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(0, 3, 4),
            Arrays.asList(0),
            Arrays.asList(1),
            Arrays.asList(1)
        );
        System.out.println("BFS Traversal : " + bfsOfGraph(V, arr));
    }
}
