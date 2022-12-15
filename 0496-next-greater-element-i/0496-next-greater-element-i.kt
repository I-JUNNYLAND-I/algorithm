class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val map = nums2.mapIndexed { index, value -> value to index }.toMap()
        return nums1.map { 
            val bIndex = map[it]!!
            var pIndex = bIndex + 1
            while (pIndex < nums2.size && nums2[pIndex] < it) pIndex++
            if (pIndex == nums2.size) -1 else nums2[pIndex]
        }.toIntArray()
    }
}