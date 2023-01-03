class Solution {
    fun canPlaceFlowers(bed: IntArray, n: Int): Boolean {
        var counter = 0
        for (i in bed.indices) {
            val left = if (i == 0) 0 else bed[i - 1]
            val right = if (i == bed.lastIndex) 0 else bed[i + 1]
            if (left == 0 && right == 0 && bed[i] == 0) {
                bed[i] = 1
                counter++
            }
        }

        return counter >= n
    }
}