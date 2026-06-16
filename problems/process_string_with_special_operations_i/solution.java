class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i<s.length(); i++){
            if ( s.charAt(i) == '*' && result.length()!=0) result.deleteCharAt(result.length()-1);
            else if( s.charAt(i) == '#') addlast(result);
            else if ( s.charAt(i) == '%') result.reverse();
            else if(Character.isLetter(s.charAt(i))) result.append( s.charAt(i)); 
        }
        return result.toString();
    }
    public StringBuilder addlast(StringBuilder a){
        StringBuilder j = a;
        return a.append(j);
    } 

}