class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray =
        nums.mapIndexed { index, num -> Pair(num, index) } 
            .sortedBy { it.first } 
            .takeLast(k) 
            .sortedBy { it.second }
            .map { it.first }
            .toIntArray()
}