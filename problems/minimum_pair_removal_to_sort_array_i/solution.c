#include <stdbool.h>
#include <limits.h>

bool issort(int* nums, int n) {
    for (int i = 1; i < n; i++) {
        if (nums[i] < nums[i - 1])
            return false;
    }
    return true;
}

int minimumPairRemoval(int* nums, int numsSize) {
    int count = 0;

    while (!issort(nums, numsSize)) {

        int minSum = INT_MAX;
        int idx = 0;

        
        for (int i = 0; i < numsSize - 1; i++) {
            if (nums[i] + nums[i + 1] < minSum) {
                minSum = nums[i] + nums[i + 1];
                idx = i;
            }
        }

        nums[idx] = minSum;

        
        for (int i = idx + 1; i < numsSize - 1; i++) {
            nums[i] = nums[i + 1];
        }

        numsSize--;  
        count++;
    }

    return count;
}
