class Solution {
    int n , m;
    boolean[][] visited;
    void dfs(char[][] grid , int x , int y) {
        if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || grid[x][y] == '0')
            return ;
        visited[x][y] = true;
        int[] new_x = {1 , -1 , 0 , 0};
        int[] new_y = {0 , 0 , 1 , -1};
        for (int i = 0 ; i < 4 ; i++) 
            dfs(grid , x + new_x[i] , y + new_y[i]);
    }
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];
        int res = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (! visited[i][j] && grid[i][j] == '1') {
                    dfs(grid , i , j);
                    res += 1;
                } 
            }
        }
        return res;
    }
}
