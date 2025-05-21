func setZeroes(matrix [][]int) {
    rows := len(matrix)
    cols := len(matrix[0])

    firstRowZero := false
    firstColZero := false

    // Check if first row has zero
    for j := 0; j < cols; j++ {
        if matrix[0][j] == 0 {
            firstRowZero = true
            break
        }
    }

    // Check if first column has zero
    for i := 0; i < rows; i++ {
        if matrix[i][0] == 0 {
            firstColZero = true
            break
        }
    }

    // Use first row and column as markers
    for i := 1; i < rows; i++ {
        for j := 1; j < cols; j++ {
            if matrix[i][j] == 0 {
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }

    // Set cells to zero based on markers
    for i := 1; i < rows; i++ {
        for j := 1; j < cols; j++ {
            if matrix[i][0] == 0 || matrix[0][j] == 0 {
                matrix[i][j] = 0
            }
        }
    }

    // Set first row to zero if needed
    if firstRowZero {
        for j := 0; j < cols; j++ {
            matrix[0][j] = 0
        }
    }

    // Set first column to zero if needed
    if firstColZero {
        for i := 0; i < rows; i++ {
            matrix[i][0] = 0
        }
    }
}
