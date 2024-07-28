import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		int dp[][] = new int[n][w+1];
		for(int row[]:dp) {
			Arrays.fill(row, -1);
		}
		return stealItems(values,weights,n-1,w,dp);
	}
	public static int stealItems(ArrayList<Integer> values, ArrayList<Integer> weights, int ind, int w, int[][] dp) {
		if(ind == 0) {
			if(weights.get(0) <= w) {
				return values.get(0);
			}
			else {
				return 0;
			}
		}
		if(dp[ind][w] != -1) {
			return dp[ind][w];
		}
		int notTake = stealItems(values,weights,ind-1,w,dp);
		int take = Integer.MIN_VALUE;
		if(weights.get(ind) <= w) {
			take = values.get(ind) + stealItems(values,weights,ind-1,w-weights.get(ind),dp); 
		}
		dp[ind][w] = Math.max(take,notTake);
		return dp[ind][w];
	}
}
