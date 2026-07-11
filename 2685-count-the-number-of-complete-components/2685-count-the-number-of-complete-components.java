class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int completeCount = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] result = dfs(i, graph, visited);
                int nodes = result[0];
                int edgesCount = result[1] / 2;
                if (edgesCount == nodes * (nodes - 1) / 2) completeCount++;
            }
        }
        return completeCount;
    }

    private int[] dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;
        int nodes = 0, edges = 0;
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            nodes++;
            edges += graph.get(curr).size();
            for (int nei : graph.get(curr)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    stack.push(nei);
                }
            }
        }
        return new int[]{nodes, edges};
    }
}
