class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int =patterns.filter { word.contains(it) }.count()
}