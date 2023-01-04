/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {

        if (nums.isEmpty()) {
            return null
        }

        val max = nums.max()
        if (max != null) {
            var treeNode = TreeNode(max)
            return dfs(nums.toList(), treeNode)

        }


        return null
    }

    private fun dfs(nums: List<Int>, treeNode: TreeNode): TreeNode? {
        val max = nums.max()
        val left = nums.slice(0 until nums.indexOf(max))
        val right = nums.slice(nums.indexOf(max) + 1..nums.lastIndex)
        if (max != null) {
            val node = TreeNode(max)
            if (left.isNotEmpty()) {
                node.left = dfs(left, node)
            }
            if (right.isNotEmpty()) {
                node.right = dfs(right, node)
            }
            return node
        }
        return null
    }
}