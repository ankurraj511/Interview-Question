class Solution { 
    int celebrity(int M[][], int n){
    	for (int i = 0 ; i < n ; i++) {
    	    int count = 0;
    	    for (int j = 0 ; j < n ; j++) {
    	        if (M[i][j] == 0)
    	            count += 1;
    	    }
    	    if (count != n) 
    	        continue;
    	    count = 0;
    	    for (int j = 0 ; j < n ; j++) {
    	        if (M[j][i] == 1)
    	            count += 1;
    	    }
    	    if (count == n - 1)
    	        return i;
    	}
    	return -1;
    }
}
