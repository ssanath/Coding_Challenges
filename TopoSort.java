class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] ind = new int[V];
        int[] topo = new int[V];
        int n=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++) {
            for(int node:adj.get(i)) {
                ind[node]++; 
            }
        }
        for(int i=0;i<V;i++) {
            if(ind[i] == 0) q.add(i);
        }
        while(!q.isEmpty()) {
            int element = q.poll();
            topo[n++] = element;
            for(int node:adj.get(element)) {
                ind[node]--;
                if(ind[node] == 0) q.add(node);
            }
        }
        return topo;
    }
}
