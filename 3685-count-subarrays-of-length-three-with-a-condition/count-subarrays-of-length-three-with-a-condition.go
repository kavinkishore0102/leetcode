func countSubarrays(nums []int) int {
    res := 0
	for i := 0; i < len(nums)-2; i++ {
		mid := nums[i+1]
		// check if mid is divisible by 2 exactly
		if mid%2 != 0 {
			continue
		}
		// now mid/2 is integer
		if nums[i]+nums[i+2] == mid/2 {
			res++
		}
	}
	return res
}