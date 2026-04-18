class Solution {
    public int mirrorDistance(int n) {
        if(n<10) return 0;
        int e = reverse(n);
        return Math.abs(n-e); 
    }
    int reverse(int n ){
        int e = 0;
        while (n > 0) {
            e = e * 10 + (n % 10);
            n /= 10;
        }
        return e;
    }
}