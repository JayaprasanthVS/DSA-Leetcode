class Solution {
    public int minOperations(String s) {
            int a = 0;
        for( char c : s.toCharArray()){
            int d = ( 26 -( c-'a'))% 26;
            a = Math.max(a,d);
        }
        return a;
    }
}