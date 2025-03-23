class Solution {
    
    public int[] shuffle(int[] nums, int n) {
        int l = n * 2;
        int[] result = new int[l];
        for (int i = 0, j = 0; i < l; i++) {
            if (i % 2 == 0) {
                result[i] = nums[j++];
            } else {
                result[i] = nums[n++];
            }
        }
        return result;
    }
}