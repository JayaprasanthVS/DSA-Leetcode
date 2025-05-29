class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);int c=0;
        char a[] =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]=='1') c++; 
        }
        return c;
    }
}