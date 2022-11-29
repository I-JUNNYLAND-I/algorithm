class Solution {
    fun findTheDifference(s: String, t: String): Char {
        return (t.sumBy { it.toInt() } - s.sumBy { it.toInt() }).toChar()
    }
}