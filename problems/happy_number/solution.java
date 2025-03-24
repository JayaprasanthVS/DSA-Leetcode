class Solution {
    public boolean isHappy(int n) {
        int s=0;
        if(n==1||n==7) return true;
        else if(n<10) return false;
        else{
            while(n>0){
                int t=n%10;
                 s+=t*t;
                 n/=10;
            }
        }
        return isHappy(s);
    }
}