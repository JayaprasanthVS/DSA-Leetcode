class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);int m=0,d=0;
        for(int i=1;i<n;i++){
         d=nums[i]-nums[i-1];
         if(m<d) m=d;
        }
        return m;
    }
}