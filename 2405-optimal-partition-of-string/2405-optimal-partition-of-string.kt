class Solution {
    fun partitionString(s: String): Int {
        val d = mutableSetOf<Char>()
        var res = 0
        s.forEach { c ->
            if (c in d) { d.clear(); res++ }
            d += c
        }
        return res + 1
    }
}