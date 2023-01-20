class Solution {
fun targetIndices(nums: IntArray, target: Int): List<Int> {
    nums.sort()
    val result = mutableListOf<Int>()
    nums.forEachIndexed() { index, i ->
        if(i == target) result.add(index)
    }
    return result
}
}
