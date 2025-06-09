class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);int a =nums.length;
        return Math.max(nums[a-1]*nums[a-2]*nums[a-3],nums[0]*nums[1]*nums[a-1]);
    }
}