internal class Solution {
    fun countTriplets(arr: IntArray): Int {
        var res = 0
        for (i in arr.indices) {
            var `val` = arr[i]
            for (k in i + 1 until arr.size) {
                `val` = `val` xor arr[k]
                if (`val` == 0) {
                    res += k - i
                }
            }
        }
        return res
    }
}