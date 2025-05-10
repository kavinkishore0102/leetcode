func getSum(nums []int) (sum, count int64) {
    for _, num := range nums {
        if num == 0 {
            count++
        } else {
            sum += int64(num)
        }
    }
    return
}

func minSum(nums1 []int, nums2 []int) int64 {
	sum1, zeroes1 := getSum(nums1)
    sum2, zeroes2 := getSum(nums2)
	if zeroes1 == 0 && sum1 < sum2+zeroes2 || zeroes2 == 0 && sum2 < sum1+zeroes1 {
		return -1
	}

	return max(sum1+zeroes1, sum2+zeroes2)
}