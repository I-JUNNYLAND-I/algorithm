class Solution {
    fun detectCapitalUse(word: String): Boolean = word.toUpperCase() == word || word.toLowerCase() == word || (word.get(0).toUpperCase() + word.substring(1,word.length).toLowerCase()) == word
}