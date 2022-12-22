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
    val list = mutableListOf<Double>()
    val queue = mutableListOf<TreeNode>()
    queue.add(root!!)
    while (queue.isNotEmpty()) {
        val size = queue.size
        var sum = 0.0
        for (i in 0 until size) {
            val node = queue.removeAt(0)
            sum += node.`val`
            if (node.left != null) {
                queue.add(node.left!!)
            }
            if (node.right != null) {
                queue.add(node.right!!)
            }
        }
        list.add(sum / size)
    }
    return list.toDoubleArray()
}
}