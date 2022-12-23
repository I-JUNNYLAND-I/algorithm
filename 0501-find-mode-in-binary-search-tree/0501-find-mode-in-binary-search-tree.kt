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
    private val map: MutableMap<Int, Int> = HashMap()
    private var high: Int = 0
    fun findMode(root: TreeNode?): IntArray {

        if (root == null) {
            return IntArray(0)
        }
        findNodeCount(root)
        return map.entries.stream()
            .filter() { entry -> map[entry.key] == high }
            .map { entry -> entry.key }
            .mapToInt(Int::toInt)
            .toArray()
    }

    private fun findNodeCount(root: TreeNode?) {
        if (map[root?.`val`] != null) {
            val before = map[root?.`val`]
            root?.`val`
                ?.let {
                    before
                        ?.plus(1)
                        ?.let { it1 ->
                            map[it] = it1
                            high = high.coerceAtLeast(it1)
                        }
                }
        } else {
            root?.`val`?.let {
                map[it] = 1
                high= high.coerceAtLeast(1)
            }
        }

        if (root?.left != null) findNodeCount(root.left)
        if (root?.right != null) findNodeCount(root.right)
    }
}