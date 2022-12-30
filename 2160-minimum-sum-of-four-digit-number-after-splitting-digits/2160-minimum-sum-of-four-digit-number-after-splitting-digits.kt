class Solution {
    fun minimumSum(num: Int): Int {

        var answer: Int = 0

        val sorted = num.toString().split("")
            .sorted()

        val subList = sorted.subList(2, sorted.size)

        return subList[0].plus(subList[3]).toInt() + subList[1].plus(subList[2]).toInt()
    }
}
