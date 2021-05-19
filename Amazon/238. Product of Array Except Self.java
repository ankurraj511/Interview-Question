class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] res = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        
        for (int i = 0 ; i < n ; i++) {
            left[i] = nums[i];
            if (i != 0)
                left[i] *= left[i - 1]; 
        }
        
        for (int i = n - 1 ; i >= 0 ; i--) {
            right[i] = nums[i];
            if (i != n - 1)
                right[i] *= right[i + 1]; 
        }
        
        for (int i = 0 ; i < n ; i++) {
            if (i == 0)
                res[i] = right[i + 1];
            else if (i == n - 1)
                res[i] = left[i - 1];
            else
                res[i] = left[i - 1] * right[i + 1];
        }
        return res;
    }
}
