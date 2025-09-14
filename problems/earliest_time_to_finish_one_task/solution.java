class Solution {
    public int earliestTime(int[][] tasks) {
        int min = 201;
        for ( int i = 0; i < tasks.length; i++){
            int c = 0;
            c = tasks[i][0]+tasks[i][1];
            min = Math.min(c,min);
        }
        return min;
    }
}