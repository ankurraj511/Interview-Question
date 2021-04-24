class Solution{
    static int countMin(String str)
    {
        int n = str.length();
        int[][] dp = new int[n][n];
        for (int gap = 1 ; gap < n ; gap++) {
            for (int i = 0 , j = gap ; j < n ; i++ , j++) {
                if (str.charAt(i) == str.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1];
                else 
                    dp[i][j] = Math.min(dp[i + 1][j] , dp[i][j - 1]) + 1;
            }
        }
        return dp[0][n - 1];
    }
}
