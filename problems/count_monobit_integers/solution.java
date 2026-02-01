class Solution {
    public int countMonobit(int n) {
        if (n < 0) return 0;
    
    // Start with 1 to account for the integer 0 (binary "0")
    int count = 1; 
    
    
    long currentAllOnes = 1; 
    
    while (currentAllOnes <= n) {
        count++;
        
        // Generate the next all-ones number: 
        // 1 (1) -> 3 (11) -> 7 (111) -> 15 (1111) ...
        currentAllOnes = (currentAllOnes << 1) | 1;
        
        // Safety break if we exceed the 32-bit integer limit
        if (currentAllOnes > Integer.MAX_VALUE) break;
    }
    
    return count;
    }
}