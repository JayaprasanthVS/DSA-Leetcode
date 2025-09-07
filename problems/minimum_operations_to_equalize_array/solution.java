class Solution {
    public int minOperations(int[] nums) {
       int n = nums.length;
        int t = nums[0];
        for(int i=1; i<n;i++){
            t&= nums[i];
        }
        boolean alle = true;
        for(int num : nums){
            if( num!= t){
                alle = false;
                break;
            }
        }
       
        return alle ? 0:1;
    }
}