class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int color[] = new int[V];
        for(int i=0;i<V;i++) color[i]=-1;
        for(int i=0;i<V;i++) {
            if(color[i] == -1) {
                if(!dfs(i,0,color,graph)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node,int col,int[] color,int[][] graph) {
        color[node] = col;
        for(int aNode : graph[node]) {
            if(color[aNode] == -1) {
                if(!dfs(aNode,1-col,color,graph)) return false;
            }
            else if(color[aNode] == col) {
                return false;
            }
        }
        return true;
    }
}
