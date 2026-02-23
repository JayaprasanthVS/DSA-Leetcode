class Solution {
    public int scoreDifference(int[] nums) {
        int first = 0, second = 0;
        boolean f = true;
        for ( int i = 0;i<nums.length;  i++ ){
            if(nums[i]%2 != 0) f = !f;
            if((i+1)%6 == 0) f = !f;
            if(f) first += nums[i];
            else second += nums[i];
        }
        return first - second;
    }
}