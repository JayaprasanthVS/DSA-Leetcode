class Solution {
    public int solve(int n, int dp[]){
        if( dp[n] != -1 ) return dp[n];
        //if( n == 0 || n == 1 || n == 2) return dp[n];
        else{
            dp[n] = solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp);
        }
        return dp[n];
    }
    public int tribonacci(int n) {
        if (n==0) return n;
        if( n == 1 || n == 2) return 1;
        int dp[] = new int[n+2];
        
        Arrays.fill(dp,-1);
        dp[0] = 0;dp[1] = 1; dp[2] = 1;
        
        //if( n == 1 || n == 2) return 1;
        return solve(n,dp);
    }
}