class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;

        int n = nums.length;
        int index = n - 2;

        for (int i = 0; i < n / 3; i++) {
            sum += nums[index];
            index -= 2;
        }

        return sum;
    }
}
