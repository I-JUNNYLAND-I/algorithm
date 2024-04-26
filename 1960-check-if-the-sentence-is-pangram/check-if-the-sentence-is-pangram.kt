class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        if (sentence.length < 26) return false
        val map = mutableMapOf<Char, Int>()
        for (i in sentence) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        return map.size == 26
    }
}