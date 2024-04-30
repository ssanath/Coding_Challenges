class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        queue.add(0);
        int popped;
        visited[0] = true;
        while(!queue.isEmpty()) {
            popped = queue.remove();
            bfs.add(popped);
            for(int node:adj.get(popped)) {
                if(!visited[node]) {
                    queue.add(node);
                    visited[node] = true;
                }
            }
        }
        return bfs;
    }
}
