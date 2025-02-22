class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int tr[][]=new int[matrix[0].length][matrix.length];
         for(int i=0;i<tr.length;i++)
           {for(int j=0;j<tr[i].length;j++)
                  tr[i][j]=matrix[j][i];
                  } 
        return tr;
    }
}