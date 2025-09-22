class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> c = new HashMap<>();
        c.put(0,1);
        int pres = 0,count = 0;
        for ( int num : nums ) {
            pres += num;
            if ( c.containsKey ( pres - k)) {
                count += c.get ( pres - k);
            }
            c.put (pres, c.getOrDefault(pres,0)+1);
        }
        return count;
    }
}