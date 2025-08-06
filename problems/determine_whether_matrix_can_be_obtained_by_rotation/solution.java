class Solution {
    public static void rotate(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;

            }
        }
        for(int i=0;i<mat.length;i++){
            int j=0,k=mat.length-1;
            while(j<k){
                int temp=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=temp;
                j++;
                k--;
            }
        }
        
    }
    public boolean matricesEqual(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int round=0;
        while(round<=3){
            rotate(mat);
            if (matricesEqual(mat,target)){
                return true;
            }
            round++;
        }
        return false;
    }
}