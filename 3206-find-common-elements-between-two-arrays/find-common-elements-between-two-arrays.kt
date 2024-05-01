class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val arr1 = nums1.map {
            if (nums2.contains(it)) 1 else 0
        }.sumOf { it }

        val arr2 = nums2.map {
            if (nums1.contains(it)) 1 else 0
        }.sumOf { it }

        return intArrayOf(arr1, arr2)
    }
}