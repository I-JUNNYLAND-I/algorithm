class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val arr = mutableListOf<Int>()
        nums.forEachIndexed { idx,it ->
            arr.add(index[idx],it)
        }
        return arr.toIntArray()
    }
}