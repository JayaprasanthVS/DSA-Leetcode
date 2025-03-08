class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> k=new ArrayList<>();
       
        int m=0;
        for(int i=0;i<candies.length;i++)
            if(m<candies[i]) m=candies[i];
        
        for(int i=0;i<candies.length;i++){
            if(m<=candies[i]+extraCandies)
                k.add(i,true);
            
            else
               k.add(i,false);
        }
       return k;
    }
}