class Solution {
    public int passwordStrength(String password) {
    int strength = 0; 
    Map <Character,Boolean> m = new HashMap<>();
    for ( char c : password.toCharArray()) {
        if ( ! m.containsKey(c)){
            m.put(c,true);
            if( c >= 'a' && c <= 'z') strength +=1;
            else if ( c >= 'A' && c <= 'Z') strength +=2;
            else if ( c >= '0' && c<= '9') strength +=3;
            else  if  ( c == '!' || c == '@' || c == '#' || c == '$' )  strength += 5;
        }
    } 
        return strength;
    }
}