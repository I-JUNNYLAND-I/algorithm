class Solution {
    fun minOperations(nums: IntArray): Int {

        var answer: Int = 0

        for (index in 0..nums.size - 2) {
            if (nums[index] >= nums[index + 1]) {
                val ignitionType = nums[index] - nums[index + 1] + 1
                nums[index + 1] += ignitionType
                answer += ignitionType
            }
        }

        return answer
    }
}