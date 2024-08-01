class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    int dp[][] = new int[n+1][k+1];
	    for(int i=1;i<=k;i++) {
	        dp[1][i] = i;
	    }
	    
	    for(int i=2;i<=n;i++) {
	        for(int j=1;j<=k;j++) {
	            dp[i][j] = Integer.MAX_VALUE;
	            int low = 1, high = j, temp = 0;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int breakCount = dp[i - 1][mid - 1];
                    int notBreakCount = dp[i][j - mid];
                    temp = 1 + Math.max(breakCount, notBreakCount);

                    if (breakCount > notBreakCount) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                    dp[i][j] = Math.min(dp[i][j], temp);
                }
	        }
	    }
	    
	    return dp[n][k];
	}
}
