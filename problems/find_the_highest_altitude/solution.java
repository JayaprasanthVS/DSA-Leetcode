class Solution {
    public int largestAltitude(int[] gain) {
    int m=0,r=0;
     for(int i=0;i<gain.length;i++)
     { r+=gain[i];
       m=Math.max(r,m);
     }
     return m;
    }
}