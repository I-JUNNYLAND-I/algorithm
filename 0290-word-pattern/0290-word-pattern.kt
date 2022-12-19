class Solution {
fun wordPattern(pattern: String, s: String): Boolean {
    val list = s.split(" ")
    if (list.size != pattern.length) return false

    val map = mutableMapOf<Char, String>()
    pattern.forEachIndexed { i, ch ->
        when (map.containsKey(ch)) {
            true -> if (map[ch] != list[i]) return false
            false -> {
                if (map.containsValue(list[i])) return false
                map[ch] = list[i]
            }
        }
    }

    return true
}
}