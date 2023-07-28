import kotlin.math.min

class Solution {
 fun minDistance(word1: String, word2: String): Int {
        val m = word1.length
        val n = word2.length
        val cost = Array(m + 1) { IntArray(n + 1) }

        for (i in 0..m) cost[i][0] = i
        for (i in 1..n) cost[0][i] = i
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (word1[i] == word2[j]) cost[i + 1][j + 1] = cost[i][j]
                else {
                    val replace = cost[i][j]
                    val delete = cost[i][j + 1]
                    val insert = cost[i + 1][j]
                    cost[i + 1][j + 1] = (min(replace.toDouble(), min(delete.toDouble(), insert.toDouble())) + 1).toInt()
                }
            }
        }
        return cost[m][n]
    }
}