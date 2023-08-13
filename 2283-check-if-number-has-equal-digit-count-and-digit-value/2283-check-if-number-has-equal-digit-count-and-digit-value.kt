class Solution {
    fun digitCount(num: String): Boolean {
        for (i in num.indices) {
            val count = num.count { it == '0' + i }
            if (count != (num[i] - '0')) {
                return false
            }
        }
        return true
    }
}