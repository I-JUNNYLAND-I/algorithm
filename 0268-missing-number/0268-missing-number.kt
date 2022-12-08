class Solution {
fun missingNumber(nums: IntArray): Int {
    for (i in 0..nums.size) {
        if (i !in nums) {
            return i
        }
    }
    return 0
}
}