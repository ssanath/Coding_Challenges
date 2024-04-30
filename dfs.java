class Solution {
    ArrayList<Integer> visited = new ArrayList<>();
    ArrayList<Integer> dfsTraversal = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        dfs(0,adj);
        return dfsTraversal;
    }
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj) {
        visited.add(v);
        dfsTraversal.add(v);
        for(int vertex: adj.get(v)) {
            if(!visited.contains(vertex)) {
                dfs(vertex,adj);
            }
        } 
    }
}
