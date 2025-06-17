func rob(nums []int) int {
     rob := 0 
     norob := 0
     for i:= 0; i<len(nums); i++{
        nrob := norob + nums[i]
        nnorob := max(norob,rob)
        rob = nrob
        norob = nnorob
     }
     return max(rob,norob)
}
