class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxcount = 0;
        StringBuilder str = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int index = str.indexOf(String.valueOf(c));
            if (index != -1) {
                str.delete(0, index + 1);
            }
            str.append(c);
            maxcount = Math.max(maxcount, str.length());
        }
        return maxcount;
    }
}