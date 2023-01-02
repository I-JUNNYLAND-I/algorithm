class Solution {
fun minSubsequence(ar: IntArray): List<Int> = with(ar.sortedDescending()) {
    for (i in ar.indices) {
        val l = subList(0, i + 1)
        if (l.sum() > subList(i + 1, lastIndex + 1).sum()) return l
    }
    return emptyList()
}
}