class Solution {
    fun sumCounts(nums: List<Int>): Int {
        val subArrays = mutableListOf<List<Int>>()
        for (i in nums.indices) {
            for (j in i until nums.size) {
                subArrays.add(nums.subList(i, j + 1))
            }
        }
        return subArrays.map { it.distinct() }
            .map { it.size }.sumOf { it * it }
    }
}