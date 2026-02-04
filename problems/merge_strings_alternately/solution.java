class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        char[] output = new char[n+m];

        int i = 0;
        int j = 0;

        int x = 0;

        while (i<n && j<m) {
            output[x++] = word1.charAt(i++); 
            output[x++] = word2.charAt(j++); 
        }

        while (i<n) {
            output[x++] = word1.charAt(i++); 
        }

        while (j<m) {
            output[x++] = word2.charAt(j++); 
        }

        return new String(output);
    }
}