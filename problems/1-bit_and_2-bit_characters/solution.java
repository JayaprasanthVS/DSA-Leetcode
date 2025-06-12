class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length-1, i = 0;
        while(i < n){
            if( bits[i] == 1 ) i+=2;
            else i++;
        }
        return i == n;
    }
}