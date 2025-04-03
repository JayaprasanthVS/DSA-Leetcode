class Solution {
    public int alternateDigitSum(int n) {
        String h = ""+n;
        int i = h.length()-1;
        int sum = 0;
        int count = 0;
        while(n > 0){
            int j = (int)Math.pow(10,i);
            if(count%2==0)
            {
                sum += n/j;
            }
            else
            {
                sum += (n/j)*(-1);
            }
            n %= j;
            i--;
            count++;
        }
        return sum;
    }
}