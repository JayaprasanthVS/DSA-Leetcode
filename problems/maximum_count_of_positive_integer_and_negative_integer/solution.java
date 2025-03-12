class Solution {
    public int maximumCount(int[] nums) {
        int pc=0,nc=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>0)
            pc+=1;
           else if(nums[i]<0) nc+=1;
        }
        return Math.max(pc,nc);
    }
}