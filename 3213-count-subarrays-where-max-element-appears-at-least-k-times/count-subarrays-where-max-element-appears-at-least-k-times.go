func countSubarrays(nums []int, k int) int64 {
    n := len(nums)
    mx := 0
    for i := 0; i < n; i++ {
        if nums[i] > mx {
            mx = nums[i]
        }
    }
    l := 0
    ans := int64(0)
    for i := 0; i < n; i++ {
        if nums[i] == mx {
            k --
        }
        if k == 0 {
            for l < i && nums[l] != mx{
                l++
            }
            ans += int64(l)+1
        }else if k < 0 {
            for l < i && k <= 0 {
                if nums[l] == mx {
                    if k == 0 {
                        break
                    }
                    k++
                }
                l++
            }
            ans += int64(l)+1
        }else if k > 0{
            for l < i && k < 0 {
                if nums[i] == mx{
                    k ++
                }
            }
        } 
    }
    return ans
}