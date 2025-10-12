class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        for ( int n : nums ) {
            f.put ( n, f.getOrDefault(n,0)+1 );
        }
        int s = 0;
        for ( int num : f.keySet()) {
            int c = f.get(num);
            if ( c % k == 0) s += num * c;
        }
        return s;
    }
}