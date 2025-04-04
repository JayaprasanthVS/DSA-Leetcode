class Solution {
    public boolean canAliceWin(int[] nums) {int c=0,h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10) c+=nums[i];
            else h+=nums[i];

        }
        if(c==h) return false;
        else return true;
    }
}