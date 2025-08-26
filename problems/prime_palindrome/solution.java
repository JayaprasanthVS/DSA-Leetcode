class Solution {
    public int primePalindrome(int n) {
        while( true ){
            if( primepalin( n )) return n;
            
            if (n > 10000000 && n < 100000000) {
                n = 100000000;
            }
            n++;
        }
    }
   public boolean primepalin(int x){
    if (x < 2) return false;
    if (x % 2 == 0) return x == 2;

    // check palindrome
    int og = x, re = 0;
    while (og > 0) {
        re = re * 10 + (og % 10);
        og /= 10;
    }
    if (x != re) return false; // compare with original x, not og

    // check prime
    for (int i = 3; i * i <= x; i += 2) {
        if (x % i == 0) return false;
    }
    return true;
   }
}