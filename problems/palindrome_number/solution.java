class Solution {
    public boolean isPalindrome(int x) {

        int n=x;
        int rev=0;
        if(x<0) return false; 

        for(int i=x;i>0;i/=10){
            int lastDigit=i%10;
            rev = rev*10+lastDigit;
        }

        return (n==rev)? true:false;
    }
}