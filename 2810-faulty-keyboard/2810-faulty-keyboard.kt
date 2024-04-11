class Solution {
    fun finalString(s: String): String {
        var result = ""
        for (i in 0 until s.length) {
            if (s[i] == 'i') {
                result = result.reversed()
            } else {
                result += s[i]
            }
        }
        return result
    }
}