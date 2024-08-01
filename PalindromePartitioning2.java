class Solution{
    static int palindromicPartition(String str)
    {
        int n = str.length();
        int dp[] = new int[n];
        for(int i=0;i<n;i++) {
            dp[i] = -1;
        }
        return f(str,n,0,dp) - 1;
    }
    public static int f(String str, int n, int ind, int[] dp) {
        if(ind == n) return 0;
        if(dp[ind] != -1) {
            return dp[ind];
        }
        int minCost = Integer.MAX_VALUE;
        for(int i=ind;i<n;i++) {
            if(isPalindrome(ind,i,str)) {
                int cost = 1+ f(str,n,i+1,dp);
                minCost = Math.min(cost,minCost);
            }
        }
        
        dp[ind] = minCost;
        
        return dp[ind];
    }
    public static boolean isPalindrome(int ind, int i, String str) {
        while(ind < i) {
            if(str.charAt(i) != str.charAt(ind)) return false;
            ind++;
            i--;
        }
        
        return true;
    }
}
