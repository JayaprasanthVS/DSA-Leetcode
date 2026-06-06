class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[] = new int[nums.length];
        for ( int i = 0; i<nums.length;i++){
            int l = 0,r = 0;
            for ( int j = 0;j<nums.length;j++){
                if ( j<i ) l += nums[j];
                else if (j>i) r += nums[j];
            }
            ans[i] = Math.abs(l-r);
        }
        return ans;
    }
}