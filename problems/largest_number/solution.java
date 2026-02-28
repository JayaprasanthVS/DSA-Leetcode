class Solution {
    public String largestNumber(int[] nums) {
        String[] ans = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(ans, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        if(ans[0].equals ("0")) {
            return sb.append("0").toString();
        }
        
        for(String s : ans){
            sb.append(s);
        }
        
        return sb.toString();

    }
}