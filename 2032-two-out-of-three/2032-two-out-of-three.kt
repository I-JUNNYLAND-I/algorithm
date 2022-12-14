class Solution {
fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
    val set = mutableSetOf<Int>()
    val set1 = nums1.toSet()
    val set2 = nums2.toSet()
    val set3 = nums3.toSet()
    set.addAll(set1)
    set.addAll(set2)
    set.addAll(set3)
    val result = mutableListOf<Int>()
    for (i in set) {
        if (set1.contains(i) && set2.contains(i) || set1.contains(i) && set3.contains(i) || set2.contains(i) && set3.contains(i)) {
            result.add(i)
        }
    }
    return result
}
}