class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> st = new Stack<>();
        int vis[] = new int[V];
        int topo[] = new int[V];
        int ind = 0;
        for(int i=0;i<V;i++) {
            if(vis[i] == 0) findTopo(i,vis,st,adj);
        }
        while(!st.isEmpty()) {
            topo[ind++] = st.pop();
        }
        return topo;
    }
    static void findTopo(int node,int vis[],Stack<Integer> st,ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for(int element:adj.get(node)) {
            if(vis[element] == 0) {
                findTopo(element,vis,st,adj);
            }
        }
        st.push(node);
    }
}
