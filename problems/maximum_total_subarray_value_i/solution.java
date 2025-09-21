class Solution {
    public long maxTotalValue(int[] nums, int k) {
  
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // find global max and min
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        long diff = (long) max - (long) min;
        return diff * k;  // multiply by k
  
    }
}