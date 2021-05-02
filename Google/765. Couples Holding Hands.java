class Solution {
    Map<Integer , Integer> map = new HashMap<>();
    void swap(int[] row , int x , int y) {
        int temp = row[x];
        row[x] = row[y];
        row[y] = temp;
        map.put(row[x] , x);
        map.put(row[y] , y);
    }
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        for (int i = 0 ; i < n ; i++) 
            map.put(row[i] , i);
        int res = 0;
        for (int i = 0 ; i < n ; i += 2) {
            int first = row[i];
            int second = first ^ 1;
            if (second != row[i + 1]) {
                res += 1;
                swap(row , i + 1 , map.get(second)); 
            }
        }
        return res;    
    }
}
