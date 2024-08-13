class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> list = new ArrayList<>();
        if (mat[0][0] == 1) {
            boolean[][] visited = new boolean[mat.length][mat[0].length];
            findPaths(0, 0, mat, "", list, visited);
        }
        if (list.isEmpty()) {
            list.add("-1");
        }
        return list;
    }
    public void findPaths(int row, int col, int[][] mat, String str, ArrayList<String> list, boolean[][] visited) {
        int n = mat.length;
        if (row < 0 || row >= n || col < 0 || col >= n || mat[row][col] == 0 || visited[row][col]) {
            return;
        }
        if(row == n-1 && col == n-1) {
            list.add(str);
            return;
        }
        visited[row][col] = true; 
        findPaths(row-1,col,mat,str+"U",list,visited);
        findPaths(row+1,col,mat,str+"D",list,visited);
        findPaths(row,col-1,mat,str+"L",list,visited);
        findPaths(row,col+1,mat,str+"R",list,visited);
        visited[row][col] =  false;
    }
}
