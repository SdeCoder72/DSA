import java.util.*;
class Main {
    public static Map<Integer, List<Integer>> buildGraph(int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for(int[] edge : prerequisites) {
            int v = edge[0];
            int u = edge[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);

            // for undirected Graph, add below line
            // adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        return adj;
    }
    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {2, 0}, {2, 1},{3, 1}};
        Map<Integer, List<Integer>> adj = buildGraph(prerequisites);
        System.out.println(adj);
    }
}
