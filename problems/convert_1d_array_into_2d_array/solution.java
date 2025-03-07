class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       
        if(m*n==original.length){ int a[][]=new int[m][n];
            for(int i=0;i<original.length;i++){
           
                a[i/n][i%n]=original[i];
            }return a; 
            
        }else{
         int a[][]=new int[0][0];
        return a;} 
    }
}