class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var result = IntArray(nums.size)
        for (i in nums.indices) {
            var count = 0
            for (j in nums.indices) {
                if (nums[i] > nums[j]) {
                    count++
                }
            }
            result[i] = count
        }
        return result
    }
}