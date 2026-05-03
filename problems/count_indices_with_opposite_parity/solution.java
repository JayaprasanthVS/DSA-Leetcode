class Solution {
    public int[] countOppositeParity(int[] nums) {
        for ( int i = 0; i<nums.length; i++){
            int sc = 0;
            boolean odd = (nums[i]%2 == 0) ;
            
            for ( int j = i+1; j< nums.length; j++ ){
                boolean jo = (nums[j]%2 == 0) ;
                if( odd != jo){
                    sc++;
                }
            }
            nums[ i ] = sc;
        }
        return nums;
    }
}