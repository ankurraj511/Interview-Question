class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        int[][] dp = new int[n][n];
        for (int i = 0 ; i < n ; i++) 
            dp[i][i] = arr[i];
        for (int i = 0 ; i < n - 1 ; i++) 
            dp[i][i + 1] = Math.max(arr[i] , arr[i + 1]);
        for (int gap = 2 ; gap < n ; gap++) {
            for (int i = 0 , j = gap ; j < n ; i++ , j++) {
                int op1 = arr[i] + Math.min(dp[i + 1][j - 1] , dp[i + 2][j]);
                int op2 = arr[j] + Math.min(dp[i + 1][j - 1] , dp[i][j - 2]);
                dp[i][j] = Math.max(op1 , op2); 
            }
        }
        return dp[0][n - 1];
    }
}
