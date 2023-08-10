class Solution {
    private val alphabet = "abcdefghijklmnopqrstuvwxyz"
    
    fun decodeMessage(key: String, message: String): String {
        val cipher = mutableMapOf<Char,Int>()
        
        var i = 0
        key.forEach {
            if (it != ' ' && !cipher.contains(it)) {
                cipher[it] = i
                i++   
            }
        }
                
        val decodedMessage = StringBuilder()
        
        message.forEach {
            if (it == ' ') decodedMessage.append(' ')
            else
                decodedMessage.append(alphabet[cipher[it] ?: -1])
        }
                
        return decodedMessage.toString()
    }
}