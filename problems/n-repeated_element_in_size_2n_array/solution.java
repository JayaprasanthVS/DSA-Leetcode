class Solution {
    public int repeatedNTimes(int[] nums) {

        boolean[] seen = new boolean[10001]; // based on constraint

        for (int num : nums) {
            if (seen[num]) {
                return num;   // already seen → repeated element
            }
            seen[num] = true;
        }
        return -1;
    }
}
