class Solution {    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        
        var len = grid.size
        var topBottomMax = IntArray(len)
        var leftRightMax = IntArray(len)
        var result = 0
        
        for (i in 0 until len) {
            for (j in 0 until len) {
                topBottomMax[i] = Math.max(grid[i][j], topBottomMax[i])
                leftRightMax[j] = Math.max(grid[i][j], leftRightMax[j])
            }
        }
        
        
        for (i in 0 until len) {
            for (j in 0 until len) {
                result += Math.min(topBottomMax[i], leftRightMax[j]) - grid[i][j]
            }
        }
        
        return result
    }
}