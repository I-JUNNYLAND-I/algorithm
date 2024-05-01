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
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val result = mutableListOf<Double>()
        val queue = mutableListOf<TreeNode>()
        root?.let { queue.add(it) }
        while (queue.isNotEmpty()) {
            val size = queue.size
            var sum = 0.0
            for (i in 0 until size) {
                val node = queue.removeAt(0)
                sum += node.`val`
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            result.add(sum / size)
        }
        return result.toDoubleArray()
    }
}