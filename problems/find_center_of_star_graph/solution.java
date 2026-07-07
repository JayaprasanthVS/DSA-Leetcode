class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int g[] = new int[edges.length+2];
        for( int [] i : edges){
            g[i[0]]++;
            g[i[1]]++;
        }
        
        int ans = 0;
        for ( int i = 1;i<edges.length+2; i++){
            if(g[i] == n) ans = i;
        }
        return ans;
    }
}