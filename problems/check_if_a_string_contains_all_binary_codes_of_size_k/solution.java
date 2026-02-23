class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> bc_k = new HashSet<>();
        for ( int i = 0; i<=s.length()-k;i++){
            bc_k.add(s.substring(i,i+k));
        }
        return bc_k.size() == (int)Math.pow(2,k);
    }
}