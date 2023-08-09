class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        sentence.toSet()
            .let { return it.size == 26 }
    }
}