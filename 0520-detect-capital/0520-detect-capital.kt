class Solution {
    fun detectCapitalUse(word: String) = word == word.toUpperCase() || word == word.toLowerCase() || word == word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()
}