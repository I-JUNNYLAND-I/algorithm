class Solution {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val map: Map<Char, Int> = Parser(licensePlate).invoke()
        words.sortBy { it.length }
        for(word in words){
            if(isCompletable(word, map)){
                return word
            }
        }
        return ""
    }

    private fun isCompletable(word: String, map: Map<Char, Int>): Boolean {
        val wordMap = Parser(word).invoke()
        for((key, value) in map){
            if(wordMap.getOrDefault(key, 0) < value){
                return false
            }
        }
        return true
    }
}

data class Parser(val text :String){
    fun invoke(): Map<Char, Int> {
        val map = HashMap<Char, Int>()
        for (i in text){
            if(i.isLetter()){
                val char = i.lowercaseChar()
                map[char] = map.getOrDefault(char, 0) + 1
            }
        }
        return map
    }
}
