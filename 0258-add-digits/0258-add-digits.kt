class Solution {
    fun addDigits(num: Int): Int {
            var sum = num.toString()
    while (sum.length != 1){
        sum = sum.split("")
            .filter { it != "" }
            .sumBy { it.toInt() }
            .toString()
    }
    return sum.toInt()
    }
}