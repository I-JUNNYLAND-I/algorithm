class Solution {
    fun maximumCount(nums: IntArray): Int {

        nums.sort()
        var pos = 0
        var neg = 0

        for (num in nums) {
            if (num < 0) neg++
            if (num > 0) pos++
        }

        return pos.coerceAtLeast(neg)

    }
}