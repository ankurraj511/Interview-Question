class Solution 
{ 
    boolean metaStrings(String s1, String s2) { 
        if (s1.length() != s2.length())
            return false;
        int count = 0;
        for (int i = 0 ; i < s1.length() ; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                count += 1;    
            if (count > 2)
                return false;
        }
        if (count == 2)
            return true;
        return false;
    }
}
