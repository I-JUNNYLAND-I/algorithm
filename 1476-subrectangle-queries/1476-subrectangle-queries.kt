class SubrectangleQueries(val rectangle: Array<IntArray>) {
    
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i in row1..row2) {
            for (j in col1..col2) {
                rectangle[i][j] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int) = rectangle[row][col]

}