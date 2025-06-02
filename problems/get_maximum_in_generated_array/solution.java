class Solution {
    public int getMaximumGenerated(int n) {
        int i=1;
        int result=1;
        if(n==0) return 0;
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(i=1;i*2<=n;i++){
            arr[i*2]=arr[i];
            result=Math.max(result,arr[i*2]);
            if((i*2)+1<=n){
                arr[(i*2)+1]=arr[i]+ arr[i+1];
                result=Math.max(result,arr[(i*2)+1]);
            } 
        }
        return result;
    }
}