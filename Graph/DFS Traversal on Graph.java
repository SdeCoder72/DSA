import java.util.*;
class Main {
    private static void dfs(int u, Map<Integer, List<Integer>> adj, List<Integer> result, boolean[] visited) {
        if(visited[u]) return;

        visited[u] = true;
        result.add(u);

        for(int v : adj.getOrDefault(u, Collections.emptyList())) {
            if(!visited[v]) {
                dfs(v, adj, result, visited);
            }
        }
    }
    public static List<Integer> dfsOfGraph(int V, List<List<Integer>> arr) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for(int u = 0; u < V; u++) {
            adj.put(u, new ArrayList<>(arr.get(u)));
        }

        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        dfs(0, adj, result, visited);
        return result;
    }
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 2),
            Arrays.asList(0, 3, 4),
            Arrays.asList(0),
            Arrays.asList(1),
            Arrays.asList(2)
        );
        System.out.println("DFS Traversal : " + dfsOfGraph(V, arr));
    }
}
