class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ").joinToString(" ") { it.reversed() }
    }
}