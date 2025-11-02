class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        for( int i = 1; i < nums.length;i++ ) {
        int f = nums[i-1];
        int c = nums[i];
        
        for ( int j = f+1; j<c; j++) {
            ans.add( j );
        }
    }
   return ans;
}
}