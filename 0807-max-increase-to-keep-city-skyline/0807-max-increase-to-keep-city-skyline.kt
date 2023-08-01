class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val n = grid.size
        val rows = IntArray(n)
        val cols = IntArray(n)
        for(i in grid.indices){
            for(j in grid[0].indices){
                rows[i] = maxOf(rows[i], grid[i][j])
                cols[j] = maxOf(cols[j], grid[i][j])
            }
        }

        var ans = 0
        for(i in grid.indices){
            for(j in grid[0].indices){
                ans += minOf(rows[i],cols[j])-grid[i][j]
            }
        }
        return ans
    }
}

