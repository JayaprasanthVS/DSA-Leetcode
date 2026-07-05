class Solution {
    public int maxDigitRange(int[] nums) {
        int sum = 0;
        int maxrange = -1;
        for( int num : nums){
            maxrange = Math.max(maxrange,maxr(num));
        }
        for ( int num : nums){
            if( maxrange == maxr(num)){
                sum += num;
            }
        }
        return sum;
        
    }
    public int maxr(int a){
        String s = String.valueOf(a);
        int maxc = -1,minc = 10;
        for ( char c : s.toCharArray()){
            maxc = Math.max(maxc,c-'0');
            minc = Math.min(minc,c-'0');
        }
        return maxc - minc;
    }
}