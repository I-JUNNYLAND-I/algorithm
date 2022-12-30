import java.lang.Math.min
import kotlin.math.abs

class Solution {
    fun minTimeToType(word: String): Int {

        var answer: Int = 0
        var prev:Char = 'a'

        for (wordChar in word.toCharArray()) {
            val forward = abs(wordChar - prev)
            val backward = abs(26 - forward)
            answer += forward.coerceAtMost(backward) + 1
            prev = wordChar
        }
        
        return answer

    }
}
