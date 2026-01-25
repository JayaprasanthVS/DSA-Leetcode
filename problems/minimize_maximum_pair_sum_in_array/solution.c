
// Comparison function for qsort
int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}
int minPairSum(int* nums, int numsSize) {
    // Step 1: Sort the array
    qsort(nums, numsSize, sizeof(int), compare);
    
    int maxPairSum = 0;
    
    // Step 2: Pair smallest (i) with largest (numsSize - 1 - i)
    for (int i = 0; i < numsSize / 2; i++) {
        int currentSum = nums[i] + nums[numsSize - 1 - i];
        
        // Step 3: Keep track of the maximum sum encountered
        if (currentSum > maxPairSum) {
            maxPairSum = currentSum;
        }
    }
    
    return maxPairSum;
}