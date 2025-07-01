public class Solution {
    public int PossibleStringCount(string word) {
        int m = word.Length;
        int c = m;
        for( int i = 1; i < m; i++){
            if( word[i] != word[i-1]){
                c--;
            }
        } 
        return c;
    }
}