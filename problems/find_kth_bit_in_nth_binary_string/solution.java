class Solution {
    public char findKthBit(int n, int k) {
      String s = "0";

      for ( int  i = 2; i <= n; i++ ) {
        StringBuilder inversion = new StringBuilder();
        for ( char Bit :s.toCharArray()) {
            inversion.append( (Bit == '0') ? '1' : '0'); 
        }
        s = s + '1' + inversion.reverse().toString();
      }
    return s.charAt(k-1);
    }
}