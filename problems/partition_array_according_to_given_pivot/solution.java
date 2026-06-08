class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, pivot);
    
        int leftIdx = 0;
        int rightIdx = n - 1;
    
    
        for (int i = 0; i < n; i++) {
        
        if (nums[i] < pivot) {
            arr[leftIdx++] = nums[i];
        }
        
        if (nums[n - 1 - i] > pivot) {
            arr[rightIdx--] = nums[n - 1 - i];
        }
        }
    
    return arr;
    }

}