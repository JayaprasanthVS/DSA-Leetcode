class Solution {
    public long countGood(int[] nums, int k) {
        
        
        int N = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        
        int l = 0, r;                   
        int pairs = 0;
        for (r = 0; r < N; ++r)
        {
            // Add value under r pointer
            int key = nums[r];
            map.put(key, map.getOrDefault(key, 0) + 1);
            pairs += map.get(key) - 1;
            
            // If the pairs in current subarray is enough
            if (pairs >= k)  
            {
                ans += N - r;
                
                // Shrink the window
                while (l < r && pairs >= k)
                {
                    // Move the left pointer
                    key = nums[l];
                    map.put(key, map.get(key) - 1);
                    pairs -= map.get(key);
                    l++;
                    
                    // See if new Good subarray appears
                    if (pairs >= k) ans += N - r;
                }
            }
        }
        
        return ans;
    }
    
}
    