class Solution {
    public int[] sortByBits(int[] arr) {
        Comparator<Integer> sortrule = (a,b) -> {
            int onesA = countOnes(a);
            int onesB = countOnes(b);
            if ( onesA != onesB ){
                return onesA - onesB;
            }
            return a - b;
        };
        PriorityQueue<Integer> PQ = new PriorityQueue<>(sortrule);
        for ( int k : arr ){
            PQ.offer(k);
        }
        int[] res = new int[arr.length];
        int i = 0;
        while (!PQ.isEmpty()) {
            res[i] = PQ.poll();
            i++;
        }

        return res;
    }
    private int countOnes( int num ) {
        int c = 0;
        
         while( num > 0 ) {
             num &= ( num - 1 );
             c++;
         }
        return c;
    } 
}