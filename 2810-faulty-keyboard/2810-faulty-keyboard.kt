class Solution {
    fun finalString(s: String): String {
        var l = 0

        var result = ""

        for(i in s.indices) {
            if(s[i] == 'i') {
                result = result.substring(l, result.length).reversed()
            } else {
                result += s[i] 
            }
        }

        return result
    }
}