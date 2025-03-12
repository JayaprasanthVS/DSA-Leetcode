class Solution {
    public int heightChecker(int[] heights) {
        int[] e=new int[heights.length];
        System.arraycopy(heights,0,e,0,heights.length);
        Arrays.sort(e);int c=0;
        for(int i=0;i<heights.length;i++){
            if(e[i]!=heights[i])
             c++;
        }
        return c;
    }
}