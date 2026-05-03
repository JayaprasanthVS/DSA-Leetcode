class Solution {
    String shift(String x){
        StringBuilder ans = new StringBuilder();
        ans.append(x.substring(1));
        ans.append(x.charAt(0));
        return ans.toString();
    }
    public boolean rotateString(String s, String goal) {
        int l = s.length();
        String rotate = s;
        for( int i = 0; i<l;i++){
            rotate = shift(rotate);
            if(goal.equals(rotate)){
                return true;
            }

        }
        return false;
    }
}
