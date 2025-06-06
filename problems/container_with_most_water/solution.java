class Solution 
{
    public int maxArea(int[] height) 
    {
        int r = height.length-1 ;
        int l = 0 ;
        int a = -1 ;
        while ( r > l )
        {
            int w = r - l ;
            int h = Math.min ( height[r] , height[l]) ;
            a = Math.max ( a , w*h) ;
            if ( height[r] > height[l]) l++ ;
            else r-- ;
        }
        return a ;
    }
}