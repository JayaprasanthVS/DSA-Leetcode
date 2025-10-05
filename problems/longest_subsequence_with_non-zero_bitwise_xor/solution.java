class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        if ( nums == null || nums.length == 0 ) return 0;
        int xor = 0;
        for ( int i : nums ) {
            xor ^= i;
        }
        if ( xor != 0 ) return n;
         boolean hasNonZeroElement = false;
        for (int num : nums) {
            if (num != 0) {
                hasNonZeroElement = true;
                break;
            }
        }

        if (!hasNonZeroElement) {
            return 0;
        }

        return nums.length - 1;
    }
}