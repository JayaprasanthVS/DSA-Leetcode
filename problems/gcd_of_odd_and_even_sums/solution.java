class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = 0,b =0, i= n*2;
        while (i>0){
            if (i%2 == 0) a+=i;
            else b += i;
            i--;
        }
        return gcd(b,a);
        
    }
    int gcd( int a,int b){
        if( b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}