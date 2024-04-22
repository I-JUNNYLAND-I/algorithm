class Solution {
    fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
        val m = grid.size
        val n = grid.first().size
        val halfPerimeter = m + n
        val onesRow = IntArray(m) { 0 }
        val onesCol = IntArray(n) { 0 }

        for (i in 0 until m)
            for (j in 0 until n)
                if (grid[i][j] == 1) {
                    onesRow[i] += 1
                    onesCol[j] += 1
                }
        
        val diff = Array<IntArray>(m) { i ->
            IntArray(n) { j -> 
                2 * (onesRow[i] + onesCol[j]) - halfPerimeter
            }
        }

        return diff
    }
}