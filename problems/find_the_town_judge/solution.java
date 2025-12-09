class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];

        for (int[] t : trust) {
            score[t[0]]--;  // this person trusts someone → minus
            score[t[1]]++;  // this person is trusted → plus
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i; // found judge
            }
        }

        return -1; // no judge
    }
}
