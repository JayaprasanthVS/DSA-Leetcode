class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean b=false;
        for(char i= 'a';i<='z';i++){
            String s=""+i;
            if(sentence.contains(s)) b=true;
            else{
                 b=false; 
                 break;}

        }
        if(b)return true;
        return false;
    }
}