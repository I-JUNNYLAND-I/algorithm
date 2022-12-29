class Solution {
fun minOperations(nums: IntArray): Int {
    if (nums.size == 1) return 0

    var count = 0
    for (index in 0 until nums.size - 1) {
        if (nums[index] >= nums[index + 1]) {
            val diff = 1 + nums[index] - nums[index + 1]
            nums[index + 1] = nums[index] + 1
            count += diff
        }
    }

    return count
}
}