class Solution {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        val patternUniqueChars = pattern.toSet().size
        val result = mutableListOf<String>()
        
        for (word in words) {
            if (patternUniqueChars == word.toSet().size) {
                val map = mutableMapOf<Char,Char>()
                var matchesPattern = true

                for ((i, patternChar) in pattern.withIndex()) {
                    if (map.containsKey(patternChar)) {
                        if (map[patternChar] != word[i]) {
                            matchesPattern = false
                            break
                        }
                    } else {
                        map[patternChar] = word[i]
                    }
                }
                
                if (matchesPattern)
                    result.add(word)
            }
        }
        
        return result
    }
}