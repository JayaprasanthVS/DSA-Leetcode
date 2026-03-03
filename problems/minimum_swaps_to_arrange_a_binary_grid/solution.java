class Solution {
    public int minSwaps(int[][] grid) {
    int points[] = new int[grid.length];
    for ( int i  = 0; i<grid.length; i++ ) {
        for ( int j = grid.length-1; j >-1 && grid[i][j] == 0; j-- ) {
             points[i]++;
        }
    }
    int operations = 0;
    for ( int i = 0; i<grid.length;  i++ ) {
        int required = grid.length - i - 1;
        int j = i;

        while  ( j < grid.length && points[j] < required ) j++;

        if ( j == grid.length) return -1;

        while( j > i) {
            int temp = points[j]; 
            points[j] = points[j-1];
            points[j-1] =  temp;
            j--;
            operations++;
        }  
    }
    return operations;
    }
}