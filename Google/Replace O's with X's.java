class Solution{
    static void helper(char[][] a , int x , int y) {
        int n = a.length , m = a[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m || a[x][y] != '-')
            return ;
        a[x][y] = 'O';
        helper(a , x + 1 , y);
        helper(a , x - 1 , y);
        helper(a , x , y + 1);
        helper(a , x , y - 1);
    }
    static char[][] fill(int n, int m, char a[][])
    {
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (a[i][j] == 'O')
                    a[i][j] = '-';
            }
        }
        for (int i = 0 ; i < n ; i++) {
            if (a[i][0] == '-')
                helper(a , i , 0);
        }
        for (int i = 0 ; i < n ; i++) {
            if (a[i][m - 1] == '-')
                helper(a , i , m - 1);
        }
        for (int i = 0 ; i < m ; i++) {
            if (a[0][i] == '-')
                helper(a , 0 , i);
        }
        for (int i = 0 ; i < m ; i++) {
            if (a[n - 1][i] == '-')
                helper(a , n - 1 , i);
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (a[i][j] == '-')
                    a[i][j] = 'X';
            }
        }
        return a;
    }
}
