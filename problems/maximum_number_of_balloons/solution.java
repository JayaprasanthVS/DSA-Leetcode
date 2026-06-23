class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> m = new HashMap<>();
        for ( char i : text.toCharArray()){
            if ( i == 'b' || i == 'a' || i == 'l' || i == 'o' || i == 'n') m.put(i,m.getOrDefault(i,0)+1);
        }
        if ( m.size()<5) return 0;
        int maxe = 99999;
        m.put('l',m.get('l')/2);
        m.put('o',m.get('o')/2);
        for ( Map.Entry<Character,Integer> ent : m.entrySet()){
            maxe = Math.min(maxe,ent.getValue());
        }
        return maxe;
    }
}