class Solution {
fun findRelativeRanks(score: IntArray): Array<String> {
    val sorted = score.sortedArrayDescending()
    val map = sorted.mapIndexed { index, i -> i to index }.toMap()
    return score.map { map[it]!! }.map {
        when (it) {
            0 -> "Gold Medal"
            1 -> "Silver Medal"
            2 -> "Bronze Medal"
            else -> (it + 1).toString()
        }
    }.toTypedArray()

}
}