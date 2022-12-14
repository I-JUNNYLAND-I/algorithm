class Solution {
    fun sortSentence(s: String): String =s.split(" ").sortedBy { it.last() }.joinToString(" ") { it.dropLast(1) }
}