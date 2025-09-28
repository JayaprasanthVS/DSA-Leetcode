class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> a = new ArrayList<>();
        int p = 1;
        
        while ( n > 0 ){
            int d = n % 10;
            if ( d != 0 ) {
                a.add (d*p);
            }
            n/=10;
            p*= 10;
            
        }
        a.sort(Collections.reverseOrder());
        int[] ans = new int[a.size()];
        for ( int i = 0; i< a.size(); i++ ) {
            ans[i] = a.get(i);
        }
        
        return ans;
        
    }
}