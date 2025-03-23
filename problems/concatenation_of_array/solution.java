class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] array= new int[2*len];
        System.arraycopy(nums,0,array,0,len);
        System.arraycopy(nums,0,array,len,len);
        return array;
    }
}