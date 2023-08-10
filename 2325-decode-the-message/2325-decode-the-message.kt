class Solution {
    fun decodeMessage(key: String, message: String): String {
         val keySet = key.toSet().filter{ s: Char -> s != ' '}
        val result =  StringBuilder()
        message.forEach { m ->
            if (m != ' ') {
                result.append('a'+ keySet.indexOf(m))
            } else {
                result.append(' ')
            }
        }
        return result.toString()
    }
}