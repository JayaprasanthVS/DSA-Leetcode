import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] A, int k) {
        int n = A.length;
        if (A == null || n == 0 || k > n) return new int[0];
        int[] Max = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && A[deque.peekLast()] < A[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            if (i >= k - 1) {
                Max[i - k + 1] = A[deque.peekFirst()];
            }
        }
        return Max;
    }
}