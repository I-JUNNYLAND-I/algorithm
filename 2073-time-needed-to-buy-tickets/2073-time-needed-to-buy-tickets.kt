class Solution {
    fun timeRequiredToBuy(t: IntArray, k: Int): Int {
        val n = t.size
        var result = 0
        for (i in 0..n-1) {
             result += minOf(t[i], if (i > k) t[k] - 1 else t[k])
        }
        return result
    }
}