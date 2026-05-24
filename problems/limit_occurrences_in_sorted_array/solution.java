class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int in = 0;
        for (int num: nums){
            if( in < k || num !=  nums[in-k]){
                nums[in++] = num;
            }
        }
        return Arrays.copyOf(nums,in);
        
    }
}