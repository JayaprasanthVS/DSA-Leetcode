class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0;
        int n = nums.length;
        int sum = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i<n-1; i++ ){
            sum -= nums[i];
            int elements = n - i - 1;
            if(nums[i]* elements > sum){
                count++;
            }
        }
        return count;
    
    }
}