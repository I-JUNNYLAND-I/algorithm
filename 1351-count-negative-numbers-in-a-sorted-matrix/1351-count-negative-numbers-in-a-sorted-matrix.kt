class Solution {
fun countNegatives(grid: Array<IntArray>): Int {
    var count = 0
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] < 0) {
                count++
            }
        }
    }
    return count
}
}