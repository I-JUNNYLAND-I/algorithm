class Solution {
    fun minOperations(boxes: String): IntArray {
        var result = IntArray(boxes.length)
        var count = 0
        for (i in boxes.indices) {
            for (j in boxes.indices) {
                if (boxes[j] == '1') {
                    count += Math.abs(i - j)
                }
            }
            result[i] = count
            count = 0
        }
        return result
    }
}