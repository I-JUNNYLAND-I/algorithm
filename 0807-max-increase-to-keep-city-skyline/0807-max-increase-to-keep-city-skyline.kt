import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {

        val row = IntArray(grid.size)
        val col = IntArray(grid[0].size)

        var answer = 0

        for (i in grid.indices) {
            row[i] = grid[i][0]
            col[i] = grid[0][i]
            for (j in grid[i].indices) {
                row[i] = max(row[i], grid[i][j])
                col[i] = max(col[i], grid[j][i])
            }
        }

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                answer += min(row[i], col[j]) - grid[i][j];

            }
        }


        return answer
    }
}