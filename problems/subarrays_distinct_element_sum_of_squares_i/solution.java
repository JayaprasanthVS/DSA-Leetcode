class Solution {
    public int sumCounts(List<Integer> nums) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> h = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                h.add(nums.get(j));
                count += h.size() * h.size();
            }
        }
        return count;
    }
}