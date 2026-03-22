class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if(n<=1){
            return true;
        }
        int countOdd = 0;
        for ( int num : nums1){
            if (num %2 != 0){
                countOdd++;
            }
        }
        boolean even = (countOdd == 0 || countOdd >= 2);
        boolean odd = (countOdd >= 1);
        return even || odd;
    }
}