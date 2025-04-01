class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        char[] m = s.toCharArray();
        for(int i =0;i<s.length();i++){
            if(m[i]=='6') {
              m[i]='9';
              break;}

        }
        s=String.valueOf(m);
        return Integer.parseInt(s);
    
    }
}