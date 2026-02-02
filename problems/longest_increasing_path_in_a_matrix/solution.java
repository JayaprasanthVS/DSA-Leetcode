class Solution {
    private int[][] dp;
    private int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        m = matrix.length;
        n = matrix[0].length;
        dp = new int[m][n];

        int maxPath = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPath = Math.max(maxPath, dfs(matrix, i, j));
            }
        }
        return maxPath;
    }

    private int dfs(int[][] matrix, int i, int j) {
        if (dp[i][j] != 0) return dp[i][j];

        int max = 1; // minimum path length is 1 (the cell itself)

        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];

            if (x >= 0 && y >= 0 && x < m && y < n 
                && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, x, y));
            }
        }

        dp[i][j] = max;
        return max;
    }
}
