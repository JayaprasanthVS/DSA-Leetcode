class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int m=(int)((l+h)/2);
            if(nums[l]<nums[h]){
                return nums[l];
            }else if(nums[m]>nums[h]){
                l=m+1;
            }else
                h=m;
            
        } return nums[l];
       }    
}