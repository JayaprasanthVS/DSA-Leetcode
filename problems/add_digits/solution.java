class Solution {
    public int addDigits(int num) {
        if(num<10) return num;int s=0;
        while(num>0){
            int t=num%10;
            s+=t;
            num/=10;
        }
        return addDigits(s);
    }
}