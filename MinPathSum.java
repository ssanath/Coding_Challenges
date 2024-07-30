class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int row[]:dp) {
            Arrays.fill(row,-1);
        }
        return minPath(grid,m,n,0,0,dp);
    }
    public int minPath(int[][] grid,int m,int n,int down,int right,int[][] dp) {
        if(down == m-1 && right == n-1) {
            return grid[down][right];
        }
        if(down>m-1 || right>n-1) {
            return 7000;
        }
        if(dp[down][right] != -1) {
            return dp[down][right];
        }
        if(down<m && right<n) {
            int goDown = grid[down][right] + minPath(grid,m,n,down+1,right,dp);
            int goRight = grid[down][right] + minPath(grid,m,n,down,right+1,dp);
           dp[down][right] = Math.min(goDown,goRight);
        }

        return dp[down][right];
    }
}
