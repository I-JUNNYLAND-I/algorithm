class Solution {
fun minPairSum(nums: IntArray): Int {
    nums.sort()
    var max = 0
    var i = 0
    var j = nums.size - 1
    while (i < j) {
        max = Math.max(max, nums[i++] + nums[j--])
    }
    return max
}
}