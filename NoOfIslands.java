class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int vis[][] = new int[row][col];
        int count = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(vis[i][j]==0 && grid[i][j] == '1') {
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count; 
    }
    public void bfs(int row, int col, int[][] vis, char[][] grid) {
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty()) {
            int f = q.peek().first;
            int s = q.peek().second;
            q.remove();
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            for(int x=0;x<4;x++) {
                int k = f + dx[x];
                int l = s + dy[x];
                if(k>=0 && k<n && l>=0 && l<m && vis[k][l]==0 && grid[k][l]=='1') {
                    vis[k][l] = 1;
                    q.add(new Pair(k,l));
                }
            }
        }
    }
}
