class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        int i = 1;
        while ( n > 0 ){
            int ld = n%10; 
            if(ld != 0) {
                x += ld*i;
                sum += ld;
                i*=10;
            }
            n/=10;
             
        }
        //System.out.print(x);
        return sum*x; 

    }
}