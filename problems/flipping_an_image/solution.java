class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
       
        
        for(int i=0;i<n;i++){
            int m=image[i].length;
            for(int j=0;j<(m+1)/2;j++){
                int t=image[i][j]^1;
                image[i][j]=image[i][n-1-j]^1;
                image[i][n-1-j]=t;
            }
        }
        

          
        return image;
    }
}