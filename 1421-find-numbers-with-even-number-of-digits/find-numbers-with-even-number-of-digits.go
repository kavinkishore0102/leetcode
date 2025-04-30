func checkDigit(num int) int {
    digit := 0
    if num == 0 {
        return 1
    }
    for num > 0 {
        digit++
        num = num / 10
    }
    return digit
}

func findNumbers(nums []int) int {
    count := 0
    for i := 0; i < len(nums); i++{
        digit := checkDigit(nums[i])
        if(digit % 2 == 0){
            count++
        }
    }
    return count
}