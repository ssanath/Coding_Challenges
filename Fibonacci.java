class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int dp[] = new int[n+1];
        for(int i=0;i<n+1;i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        dp[1] = 1;
        return fibonacci(n,dp);
    }
    public int fibonacci(int n, int[] dp) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n] != -1) return dp[n];
        dp[n-1] = fibonacci(n-1,dp);
        dp[n-2] = fibonacci(n-2,dp);
        return dp[n-1]+dp[n-2];
    }
}
