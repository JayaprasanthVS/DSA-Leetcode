class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++){
        int count = 0;
        String bit = Integer.toBinaryString(i);
        for(char ch : bit.toCharArray()){
            if(ch == '1')
              count++;
        
        }
        a[i]=count;
    }
    return a;
    }
}