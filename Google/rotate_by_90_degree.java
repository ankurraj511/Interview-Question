class Solution{
    static void swap(int matrix[][] , int st_i , int st_j , int end_i, int end_j) {
        int temp = matrix[st_i][st_j];
        matrix[st_i][st_j] = matrix[end_i][end_j];
        matrix[end_i][end_j] = temp;
    }
    
    static void rotateby90(int matrix[][], int n) 
    { 
        int st_i = 0 , st_j = -1 , end_i = -1 , end_j = n - 1;
        int count = n;
        for (int i = 0 ; i < n / 2 ; i++) {
            for (int j = 0 ; j < count ; j++) {
                st_j += 1;
                end_i += 1;
                swap(matrix , st_i , st_j , end_i , end_j);
            }
            for (int j = 0 ; j < count - 1 ; j++) {
                st_i += 1;
                end_j -= 1;
                swap(matrix , st_i , st_j , end_i , end_j);
            }
            for (int j = 0 ; j < count - 2 ; j++) {
                st_j -= 1;
                end_i -= 1;
                swap(matrix , st_i , st_j , end_i , end_j);
            }
            int temp1 = st_i;
            int temp2 = st_j;
            st_i = end_i;
            st_j = end_j;
            end_i = temp2 - 1;
            end_j = temp1 - 1;
            count -= 2;
        }
    }
}
