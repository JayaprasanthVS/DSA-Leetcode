class Solution {
    public int scoreOfString(String s) {
        int su=0;
        for(int i=1;i<s.length();i++){
         su+=Math.abs(s.codePointAt(i-1)-s.codePointAt(i));
            }
        return su;
    }
}