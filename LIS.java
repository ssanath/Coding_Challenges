class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        int max = subSeq(0,-1,nums,dp);
        return max;
    }
    public int subSeq(int ind,int prev_ind,int[] nums, int[][] dp)
    {
        if(ind == nums.length)
        {
            return 0;
        }
        if(dp[ind][prev_ind+1] != -1)
        {
            return dp[ind][prev_ind+1];
        }
        int notTake = 0 + subSeq(ind+1,prev_ind,nums,dp);
        int take=0;
        if(prev_ind == -1 || nums[ind]>nums[prev_ind])
        {
            take = 1 + subSeq(ind+1,ind,nums,dp);
        }
        dp[ind][prev_ind+1] = Math.max(take,notTake);
        return dp[ind][prev_ind+1];
    }
}
