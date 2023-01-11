class Solution {
    fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {
        var max = Integer.MIN_VALUE
        for (num in nums) {
            max = Math.max(num, max)
        }
        val maxIndex = nums.indexOf(max)
        fun constructTree(lo: Int, hi:Int, mid: Int): TreeNode? {
            val result = TreeNode(nums[mid])
            if (lo < mid) {
                var leftMax = Integer.MIN_VALUE
                for (i in mid-1 downTo lo) {
                    leftMax = Math.max(leftMax, nums[i])
                }
                result?.left = constructTree(lo, mid - 1, nums.indexOf(leftMax))
            }
            if (hi > mid) {
                var rightMax = Integer.MIN_VALUE
                for (i in mid+1..hi) {
                    rightMax = Math.max(rightMax, nums[i])
                }
                result?.right = constructTree(mid + 1, hi, nums.indexOf(rightMax))
            }
            return result
        }
        return constructTree(0, nums.size - 1, maxIndex)
    }
}