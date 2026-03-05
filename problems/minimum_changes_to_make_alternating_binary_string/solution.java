class Solution {
    public int minOperations(String s) {
        int zcount = 0; 
        int n = s.length();
        
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                zcount++;
            }
        }
        
        return Math.min(zcount, n - zcount);
    }
}
