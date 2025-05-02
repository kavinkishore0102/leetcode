func pushDominoes(dominoes string) string {
    chars := []byte(dominoes)
    n := len(chars)
    i := 0

    for i < n {
        if chars[i] == 'R' {
            j := i + 1
            for j < n && chars[j] == '.' {
                j++
            }

            if j < n && chars[j] == 'L' {
                left, right := i+1, j-1
                for left < right {
                    chars[left] = 'R'
                    chars[right] = 'L'
                    left++
                    right--
                }
                i = j + 1
            } else {
                for k := i + 1; k < j; k++ {
                    chars[k] = 'R'
                }
                i = j
            }

        } else if chars[i] == 'L' {
            j := i - 1
            for j >= 0 && chars[j] == '.' {
                chars[j] = 'L'
                j--
            }
            i++
        } else {
            i++
        }
    }

    return string(chars)
}
