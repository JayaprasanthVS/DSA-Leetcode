class Solution {
    public int largestInteger(int n, int s) {
        if ( s>9*n) return -1;
        if ( s == 0 ) return 0;
        StringBuilder r = new StringBuilder();
        for ( int i = 0; i<n; i++) {
            int d = Math.min(9,s);
            r.append(d);
            s-=d;
        }
        return Integer.parseInt(r.toString());
    }
}