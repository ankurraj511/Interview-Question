class Solution
{
    static boolean check(int[][] grid , int x , int y , int k) {
        int l = 0;
        for (int i = (x / 3) * 3 ;  i < ((x / 3) * 3) + 3 ; i++) {
            for (int j = (y / 3) * 3 ; j < ((y / 3) * 3) + 3 ; j++) {
                if (grid[i][j] == k || grid[x][l] == k || grid[l][y] == k)
                    return false;
                l += 1;
            }
        }
        return true;
    }
    static boolean helper(int grid[][] , int x , int y) {
        if (x == 8 && y == 9)
            return true;
        if (y == 9) {
            x = x + 1;
            y = 0;
        }
        if (grid[x][y] == 0) {
            for (int k = 1 ; k <= 9 ; k++) {
                if (check(grid , x , y , k)) {
                    grid[x][y] = k;
                    if (helper(grid , x , y + 1))
                        return true;
                    grid[x][y] = 0;
                }
            }
            return false;
        } 
        return helper(grid , x , y + 1);
    }
    static boolean SolveSudoku(int grid[][]) {
        return helper(grid , 0 , 0);
    }
    static void printGrid (int grid[][]) {
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) 
                System.out.print(grid[i][j] + " ");
        }
    }
}
