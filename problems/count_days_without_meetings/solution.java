class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        int start = meetings[0][0];
        int end = meetings[0][1];
        int cnt = 0;
        for(int i=1;i<n;i++){
            if(meetings[i][0]<=end){
                end = Math.max(end,meetings[i][1]);
            }
            else{
                cnt += (end-start+1);
                start = meetings[i][0];
                end = meetings[i][1];
            }	      
        }
        cnt += (end-start+1);
        return days-cnt;
        
    }
}
   