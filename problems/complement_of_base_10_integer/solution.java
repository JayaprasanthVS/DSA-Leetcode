class Solution {
    public int bitwiseComplement(int n) {
        String  s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int i= 0;
        while (i<s.length()){
            if(s.charAt(i) =='1') sb.append('0');
            else sb.append('1');
            i++;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}