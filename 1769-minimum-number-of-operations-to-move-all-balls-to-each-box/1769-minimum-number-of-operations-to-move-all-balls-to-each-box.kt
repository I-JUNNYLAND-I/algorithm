import kotlin.math.abs

class Solution {
    fun minOperations(boxes: String): IntArray {

        val answer = IntArray(boxes.length)

        val filter = boxes.split("")
            .filter { it != "" }
        filter
            .forEachIndexed { index, h ->
                var sum = 0
                filter.forEachIndexed { innerIndex, innerElement ->
                    if (innerElement == "1" && index != innerIndex) {
                        sum += abs(index - innerIndex)
                    }
                }
                answer[index] = sum
            }

        return answer
    }
}