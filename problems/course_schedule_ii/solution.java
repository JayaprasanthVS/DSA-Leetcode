class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g = new ArrayList<>();
        int[] a = new int[numCourses];
        for ( int i = 0; i<numCourses; i++) {
            g.add(new ArrayList<>());
        }
        for ( int[] edge : prerequisites ) {
            int c = edge[0];
            int p = edge[1];
            g.get(p).add(c);
            a[c]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for ( int i = 0; i<numCourses; i++ ) {
            if ( a[i] == 0 ) q.offer(i);
        }
        int[] o = new int[numCourses];
        int in = 0;
        while ( !q.isEmpty()) {
            int cur = q.poll();
            o[in++] = cur;
            for ( int n: g.get(cur)) {
                a[n]--;
                if ( a[n] == 0) q.offer(n);
            }
        }
        return in == numCourses ? o : new int[0];
    }
}