class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        if (timeSeries.isEmpty()) return 0
        var durations = 0
        val segment = timeSeries.map { it to it + duration }.reduce { acc, pair ->
            if (pair.first < acc.second) {
                Pair(acc.first, pair.second)
            } else {
                durations += acc.second - acc.first
                pair
            }
        }
        return durations + segment.second - segment.first
    }
}