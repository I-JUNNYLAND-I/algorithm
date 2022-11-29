class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int = patterns.count { word.contains(it) }
}