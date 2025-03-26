class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);boolean b=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) {
                b=true;
                break;
            }
        }
        return b;
    }
}