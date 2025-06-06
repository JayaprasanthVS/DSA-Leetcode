class Solution {
    public int projectionArea(int[][] grid) {
        int x = 0 , y = 0 , g = 0;
        for(int i = 0 ; i < grid.length ; i++)
            {   int k = 0 , l = 0 ;
                for(int j = 0 ; j < grid.length ; j++)
                    {
                        k = Math.max( k , grid[i][j]);
                        l = Math.max( l , grid[j][i]);
                        if (grid[i][j]>0) g++ ;
                    }
                x += k; y += l;
            }
        return g + x + y ;
    }
}