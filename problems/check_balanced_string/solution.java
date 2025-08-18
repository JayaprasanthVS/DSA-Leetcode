class Solution{
    public boolean isBalanced(String num) {
        int diff = 0, sign = 1, n = num.length();
        for (int i = 0; i < n; ++i) {
            diff += sign * (num.charAt(i) - '0');
            sign = -sign;
        }
        return diff == 0;
    }
}