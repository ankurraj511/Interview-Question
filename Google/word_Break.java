class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        int n = A.length();
        int[] dp = new int[n];
        for (int i = 0 ; i < n ; i++) {
            if (i == 0 || dp[i - 1] == 1) {
                for (int j = 0 ; j < B.size() ; j++) {
                    int k = 0 , l = i;
                    while (l < n && k < B.get(j).length() && B.get(j).charAt(k) == A.charAt(l)) {
                        k += 1;
                        l += 1;
                    }
                    if (k == B.get(j).length())
                        dp[l - 1] = 1; 
                }
            }
        }
        return dp[n - 1];
    }
}
