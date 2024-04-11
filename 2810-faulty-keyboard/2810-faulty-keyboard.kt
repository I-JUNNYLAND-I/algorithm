class Solution {
    fun finalString(s: String): String {
        var result = ""
        for (i in s.indices) {
            if (s[i] == 'i') {
                result = result.reversed()
            } else {
                result += s[i]
            }
        }
        return result
    }
}