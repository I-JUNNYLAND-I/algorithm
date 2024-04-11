class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        return words.map { Convertor(it).toMorse() }.toSet().size
    }
}

data class Convertor(val word: String){
    fun toMorse() = word.toList().joinToString("") { table[it - 'a'] }

    companion object {
        val table = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    }
}