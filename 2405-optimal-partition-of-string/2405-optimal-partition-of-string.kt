import java.util.*

class Solution {
    fun partitionString(s: String): Int {
        val lastSeen = IntArray(26)
        Arrays.fill(lastSeen, -1)
        var count = 1
        var substringStart = 0
        for (i in 0 until s.length) {
            if (lastSeen[s[i].toInt() - 'a'.toInt()] >= substringStart) {
                count++
                substringStart = i
            }
            lastSeen[s[i].toInt() - 'a'.toInt()] = i
        }
        return count
    }
}