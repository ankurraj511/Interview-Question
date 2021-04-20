class Solution{
    static int countBits(int N, long A[])
    {
        int count , mod = 1000000007;
        long ans = 0;
        for(int i = 0 ; i < 32 ; i++) {
            count = 0;
            for(int j = 0 ; j < N ; j++) 
                if ((A[j] & (1 << i)) > 0)
                    count += 1;
            ans = (ans +  (count * (N-count))) % mod;
        }
        return (int)((2 * ans) % mod);
    }
}
