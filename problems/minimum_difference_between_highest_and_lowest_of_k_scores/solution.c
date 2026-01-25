
int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}
int minimumDifference(int* nums, int numsSize, int k) {
    if (k <= 1) return 0; // Edge case: only one student selected
    
    // Step 1: Sort the array
    qsort(nums, numsSize, sizeof(int), compare);
    
    int minDiff = INT_MAX;
    
    // Step 2: Use sliding window of size k
    for (int i = 0; i <= numsSize - k; i++) {
        int currentDiff = nums[i + k - 1] - nums[i];
        if (currentDiff < minDiff) {
            minDiff = currentDiff;
        }
    }
    
    return minDiff;
}
