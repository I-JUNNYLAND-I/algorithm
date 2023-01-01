class Solution {
    fun canThreePartsEqualSum(arr: IntArray): Boolean {

        var test: Int = 0
        val sum: Int = arr.sum() / 3

        var count: Int = 0

        if (sum * 3 != arr.sum()) return false

        for (value in arr) {
            test += value
            if (test < sum) {
                continue
            }
            if (test == sum) {
                test = 0
                count++
            }
        }

        return count >= 3

    }
}