class Solution {
    public int findPeakElement(int[] nums) {
        int a[]=new int[nums.length];
        System.arraycopy(nums,0,a,0,nums.length);
        Arrays.sort(a);
        int k=a[a.length-1];int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k) c=i;
        }
        return c;
    }
}