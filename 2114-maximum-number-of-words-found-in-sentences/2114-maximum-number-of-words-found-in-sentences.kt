class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        return sentences.map { it.split(" ") }.maxOf { it.size }
    }
}