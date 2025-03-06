class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet <Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
           s.add(nums[i]);
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(!s.contains(i))
             l.add(i);
        }
        return l;
    }
}