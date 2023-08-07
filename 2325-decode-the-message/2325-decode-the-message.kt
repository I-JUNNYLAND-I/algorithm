class Solution {
    fun decodeMessage(key: String, message: String): String {
        val keySet = key.replace(" ","").toSet()
        val result =  StringBuilder()
        message.forEach {
            if (it != ' ') {
                result.append('a'+ keySet.indexOf(it))
            } else {
                result.append(' ')
            }
        }
        return result.toString()
    }
}