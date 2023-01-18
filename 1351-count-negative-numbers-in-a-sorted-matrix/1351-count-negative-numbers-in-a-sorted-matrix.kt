class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var answer = 0
        for (ints in grid) {
            for (value in ints) {
                if (value < 0) answer++
            }
        }
        return answer
    }
}