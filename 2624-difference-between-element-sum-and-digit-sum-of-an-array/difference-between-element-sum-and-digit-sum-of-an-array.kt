class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        val sum = nums.sum()
        val digitSum = nums.joinToString("").split("").filter { it != "" }.sumOf { it.toInt() }
        return Math.abs(sum-digitSum)
    }
}
