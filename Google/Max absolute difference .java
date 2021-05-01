class Solution {
    
    public static int findMaxAbsDiff(int arr[], int n)
    {
        int[] leftMax = new int[n];
        int[] leftMin = new int[n];
        int sum1 = 0 , sum2 = 0 , max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        for (int i = 0 ; i < n ; i++) {
            sum1 += arr[i];
            sum2 += arr[i];
            max = Math.max(sum1 , max);
            min = Math.min(sum2 , min);
            leftMax[i] = max;
            leftMin[i] = min;
            if (sum1 < 0)
                sum1 = 0;
            if (sum2 > 0)
                sum2 = 0;
        }
        int[] rightMax = new int[n];
        int[] rightMin = new int[n];
        sum1 = 0 ; sum2 = 0 ; max = Integer.MIN_VALUE ; min = Integer.MAX_VALUE;
        for (int i = n - 1 ; i >= 0 ; i--) {
            sum1 += arr[i];
            sum2 += arr[i];
            max = Math.max(sum1 , max);
            min = Math.min(sum2 , min);
            rightMax[i] = max;
            rightMin[i] = min;
            if (sum1 < 0)
                sum1 = 0;
            if (sum2 > 0)
                sum2 = 0;
        }
        int res = 0;
        for (int i = 0 ; i < n - 1 ; i++) 
            res = Math.max(res , Math.max(Math.abs(leftMax[i] - rightMin[i + 1]) , Math.abs(rightMax[i + 1] - leftMin[i])));
        return res;
    }
}
