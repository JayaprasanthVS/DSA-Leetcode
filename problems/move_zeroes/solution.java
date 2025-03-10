class Solution {
    public void moveZeroes(int[] nums) {
   int left=0;//to keep track of the position where the next non-zero element will be moved
        for(int right=0;right< nums.length;right++){
            if(nums[right] !=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }
}