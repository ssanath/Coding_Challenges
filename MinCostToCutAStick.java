import java.util.Arrays;

class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        
        int m = cuts.length;
        int[] newCuts = new int[m + 2];
        newCuts[0] = 0;
        for (int i = 0; i < m; i++) {
            newCuts[i + 1] = cuts[i];
        }
        newCuts[m + 1] = n;
        
        int[][] dp = new int[m + 2][m + 2];
        
        for (int length = 2; length <= m + 1; length++) {
            for (int i = 0; i + length <= m + 1; i++) {
                int j = i + length;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], newCuts[j] - newCuts[i] + dp[i][k] + dp[k][j]);
                }
            }
        }
        
        return dp[0][m + 1];
    }
}
