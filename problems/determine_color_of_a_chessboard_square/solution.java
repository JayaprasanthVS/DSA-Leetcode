class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=97-coordinates.codePointAt(0);
        if((coordinates.charAt(1)+a)%2==0)
         return true;
        else
         return false;
    }
}