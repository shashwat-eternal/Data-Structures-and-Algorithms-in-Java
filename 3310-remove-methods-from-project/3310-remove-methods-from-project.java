import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
      
        List<List<Integer>> graph = new ArrayList<>();
        List<List<Integer>> reverseGraph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            reverseGraph.add(new ArrayList<>());
        }
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
            reverseGraph.get(edge[1]).add(edge[0]);
        }

      
        Set<Integer> suspicious = new HashSet<>();
        dfs(k, graph, suspicious);

        
        for (int s : suspicious) {
            for (int caller : reverseGraph.get(s)) {
                if (!suspicious.contains(caller)) {
                   
                    List<Integer> all = new ArrayList<>();
                    for (int i = 0; i < n; i++) all.add(i);
                    return all;
                }
            }
        }

       
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious.contains(i)) result.add(i);
        }
        return result;
    }

    private void dfs(int node, List<List<Integer>> graph, Set<Integer> visited) {
        if (visited.contains(node)) return;
        visited.add(node);
        for (int nei : graph.get(node)) {
            dfs(nei, graph, visited);
        }
    }
}
