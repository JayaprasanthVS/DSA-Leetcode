class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        
        for (int point : cardPoints) total += point;  // total sum
        
        if (k == n) return total;  // take all cards
        
        int windowSize = n - k;
        int windowSum = 0;
        
        // initial window
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }
        
        int minWindow = windowSum;
        
        // sliding window
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindow = Math.min(minWindow, windowSum);
        }
        
        return total - minWindow;
    }
}
