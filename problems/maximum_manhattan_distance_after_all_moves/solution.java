class Solution {
    public int maxDistance(String moves) {
        int r = 0, l = 0, u = 0, d= 0, un = 0;
        for ( int i = 0; i<moves.length(); i++){
            char a = moves.charAt(i);
            if ( a == 'R') r++;
            else if ( a == 'L') l++;
            else if ( a== 'U') u++;
            else if ( a == 'D') d++;
            else if ( a  == '_') un++;
        }
        return Math.abs(r-l)+Math.abs(u-d)+un;
    }
}