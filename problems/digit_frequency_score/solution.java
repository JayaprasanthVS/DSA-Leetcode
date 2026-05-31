class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        int arr[] = new int[10];
        while ( n > 0){
            arr[n%10]++;
            n/=10;
        }
        for ( int i = 0; i<10;i++){
            if( arr[i]>0) sum+= i*arr[i];
        }
        return sum;
    }
    
}