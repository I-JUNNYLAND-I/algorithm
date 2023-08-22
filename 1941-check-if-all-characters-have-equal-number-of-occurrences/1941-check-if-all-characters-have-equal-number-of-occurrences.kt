class Solution {
    fun areOccurrencesEqual(s: String): Boolean {

        val map = mutableMapOf<Char, Int>()
        s.forEach { c ->
            map[c] = map.getOrDefault(c, 0) + 1
        }
        
        val first = map.values.first()
        
        for (value in map.values) {
            if (value != first) {
                return false
            }
        }
        
        return true
    }
}