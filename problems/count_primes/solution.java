class Solution {
    public int countPrimes(int n) {
        if( n<=2) return 0;
        int c = 0;
        int a [] = new int [n];
        
        Arrays.fill( a, 1);
        a[0]=a[1] = 0;
        for( int  i = 2; i*i<n; i++){
            if (a[i] == 0) continue;
            for( int j = i*i; j<n; j+=i){
                a[j]=0;
            }
        }
        for ( int num : a) 
            if ( num == 1 ) c++;
        return c;
    }
}