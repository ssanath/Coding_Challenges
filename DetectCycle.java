import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] prerequisite: prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }
        boolean[] visited = new boolean[numCourses];
        for(int i=0;i<numCourses;i++) {
            if(!visited[i] && !dfs(i,graph,visited,new boolean[numCourses])) {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] path)
    {
        if(visited[node]) return true;
        if(path[node]) return false;
        path[node] = true;
        for(int neighbor:graph.get(node)) {
            if(!dfs(neighbor,graph,visited,path)) {
                return false;
            }
        }
        path[node] = false;
        visited[node] = true;
        return true;
    }
}
