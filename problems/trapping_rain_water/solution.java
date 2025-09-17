class Solution {
    public int trap(int[] height) {
        int r = height.length-1;
        int l = 0;
        int rm = height[r];
        int lm = height[l];
        int water = 0;
        while ( l < r ) {
            if ( lm < rm ) {
                l++;
                lm = Math.max( lm, height[l]);
                water += lm - height[l];
            } else {
                r--;
                rm = Math.max( rm, height[r]);
                water += rm - height[r];
            }
        }
        return water;
    }
}