class solve {
     public boolean graphColoring(boolean graph[][], int m, int n) {
        int[] color = new int[n];
        return solve(0, graph, color, n, m);
    }
    private boolean isSafe(int node, boolean graph[][], int[] color, int n, int col) {
        for (int i = 0; i < n; i++) {
            if (graph[node][i] && color[i] == col) return false;
        }
        return true;
    }
    private boolean solve(int node, boolean graph[][], int[] color, int n, int m) {
        if (node == n) return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, graph, color, n, i)) {
                color[node] = i;
                if (solve(node + 1, graph, color, n, m)) return true;
                color[node] = 0;
            }
        }
        return false;
    }
}
