class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k = k % n; 
        if (k == 0) return true;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If even row (0-indexed): left shift. New index is (j + k) % n
                // If odd row: right shift. New index is (j - k + n) % n
                int targetCol = (i % 2 == 0) ? (j + k) % n : (j - k + n) % n;
                
                if (mat[i][j] != mat[i][targetCol]) {
                    return false;
                }
            }
        }
        return true;
    }
}