class Solution {
    fun largestOddNumber(num: String): String {

        val chunked = num.chunked(1)

        for (index in chunked.lastIndex downTo 0) {
            if (chunked[index].toInt() % 2 == 0 || chunked[index].toInt() == 0) {
                continue
            } else {
                return num.substring(0, index + 1)
            }
        }

        return ""
    }
}