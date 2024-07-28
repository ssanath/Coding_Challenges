class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n][m];
        for (int row[] : dp)
            Arrays.fill(row, -1);

        return editDistanceUtil(word1, word2, n - 1, m - 1, dp);
    }
    public int editDistanceUtil(String S1, String S2, int i, int j, int[][] dp) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (S1.charAt(i) == S2.charAt(j))
            return dp[i][j] = editDistanceUtil(S1, S2, i - 1, j - 1, dp);
        else
            return dp[i][j] = 1 + Math.min(editDistanceUtil(S1, S2, i - 1, j - 1, dp),
                    Math.min(editDistanceUtil(S1, S2, i - 1, j, dp), editDistanceUtil(S1, S2, i, j - 1, dp)));
    }
}
