class Solution {
    public boolean find(String s1 , String s2) {
        int j = 0 ;
        for (int i = 0 ; i < s1.length() ; i++) {
            if (s1.charAt(i) == s2.charAt(j)) 
                j += 1;
            if (j == s2.length())
                return true;
        }
        return false;
    }
    public boolean lexSmaller(String s1 , String s2) {
        if (s1.length() > s2.length())
            return true;
        if (s1.length() < s2.length())
            return false;
        for (int i = 0 ; i < s1.length() ; i++) {
            if (s1.charAt(i) - 'a' < s2.charAt(i) - 'a') 
                return true;
            if (s1.charAt(i) - 'a' > s2.charAt(i) - 'a')
                return false;
        }
        return false;
    }
    public String findLongestWord(String s, List<String> d) {
        String res = "";
        for (int i = 0 ; i < d.size() ; i++) 
            if (find(s , d.get(i)) && lexSmaller(d.get(i) , res))
                res = d.get(i);
                
        return res;
    }
}
