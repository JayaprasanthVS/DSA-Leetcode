class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min_index = -1;
        int min_val = 101;
        for ( int i = 0; i<capacity.length; i++ ) {
            if ( capacity[i] >= itemSize && capacity[i]< min_val) {
                min_val = capacity[i];
                min_index = i;
            }
        }
        return min_index;
    }
}