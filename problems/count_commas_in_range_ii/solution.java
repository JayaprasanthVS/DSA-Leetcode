class Solution {
    public long countCommas(long n) {
        if( n<1000) return 0;
        long  count = 0;
        long  start = 1000;
        int commasPernum = 1;
        while ( start <= n ){
            long next = start * 1000;
            long end = Math.min((long)n,next-1);
            count += (end - start +1)* commasPernum;
            start = next;
            commasPernum++;
        }
        return count;
    }
}