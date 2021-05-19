class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int st = 0 , end = 0 , res = 0;
        while (end < s.length()) {
            if (freq[s.charAt(end)] == 0) 
                freq[s.charAt(end)] += 1;
            else {
                while (st < end && s.charAt(st) !=  s.charAt(end)) {
                    freq[s.charAt(st)] -= 1;
                    st += 1;
                }
                st += 1;
            }
            res = Math.max(res , end - st + 1);
            end += 1;
        }
        return res;
    }
}
