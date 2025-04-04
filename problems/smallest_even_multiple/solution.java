class Solution {
    public int smallestEvenMultiple(int n) {int i=1;
        while(i>0){
            if(i%2==0&&i%n==0) {
                n=i;
                break;
            }
            else i++;
        }
        return n;
    }
}