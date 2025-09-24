class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map <Integer,Integer> a = new HashMap<>();
        int c = 0, f = 0;
        for ( int i : nums ) {
            a.put ( i, a.getOrDefault( i, 0 ) + 1 );
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            int freq = entry.getValue();
            if ( freq == f ) c++;
            else if ( freq > f ) {
                f = freq;
                c = 1;
            }
        }
        return f*c;
    }
}