class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int c[] = new int[(grid.length*grid.length)+1];
        for( int i = 0; i < grid.length; i++)
        {
            for( int j = 0; j < grid.length; j++)
            {
                c[grid[i][j]]++;
            }
        }
        int a = -1; int  b = -1;
        for ( int n = 1; n <= grid.length*grid.length; n++)
        {
             if( c[n] == 2) a = n;
             else if( c[n] == 0) b = n;
        }
        return new int[]{ a, b };  
    }
}