class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var result = 0
        val size = mat.size - 1
        for (i in 0..size) {
            result += mat[i][i]
            if (size - i != i) result += mat[i][size - i]
        }
        return result
    }
}