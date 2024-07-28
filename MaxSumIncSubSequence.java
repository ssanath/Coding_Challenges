class Solution
{
	public int maxSumIS(int arr[], int n)  
	{
	    int[][] dp = new int[n][n+1];
	    for(int row[]:dp) {
	        Arrays.fill(row,-1);
	    }
	    return maxSum(0,-1,arr,dp);
	}
	public int maxSum(int ind,int prev,int[] arr, int[][] dp) {
	    if(ind == arr.length) {
	        return 0;
	    }
	    if(dp[ind][prev+1] != -1) {
	        return dp[ind][prev+1];
	    }
	    int notTake = maxSum(ind+1,prev,arr,dp);
	    int take = 0;
	    if(prev == -1 || arr[ind] > arr[prev]) {
	        take = arr[ind] + maxSum(ind+1,ind,arr,dp);
	    }
	    dp[ind][prev+1] = Math.max(take,notTake);
	    
	    return dp[ind][prev+1];
	}
}
