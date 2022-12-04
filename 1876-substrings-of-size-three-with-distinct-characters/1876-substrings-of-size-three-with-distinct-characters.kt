class Solution {
fun countGoodSubstrings(s: String): Int {
    var count = 0
    for (i in 0 until s.length -2) {
        val substring = s.substring(i, i + 3).map { it.toString() }
        val distinct = substring.distinct()
        if (distinct.size == 3) {
            count++
        }
    }
    return count
}
}