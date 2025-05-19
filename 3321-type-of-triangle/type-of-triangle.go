func triangleType(nums []int) string {
    
    a, b, c := nums[0], nums[1], nums[2]
    if a+b <= c || a+c <= b || b+c <= a {
        return "none"
    }
    if a == b && b == c {
        return "equilateral"
    } else if a == b || b == c || a == c{
        return "isosceles"
    } else {
        return "scalene"
    }
}