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
    var count = 0
fun distributeCoins(root: TreeNode?): Int {
    distributeCoinsHelper(root)
    return count
}

private fun distributeCoinsHelper(root: TreeNode?): Int {
    if (root == null) return 0
    val childRequire = distributeCoinsHelper(root.left) + distributeCoinsHelper(root.right)
    if (root.`val` == childRequire + 1) {
        // nothing
        return 0
    } else if (root.`val` < childRequire + 1) {
        val thisRequire = childRequire + 1 - root.`val`
        count += thisRequire
        return thisRequire
    } else if (root.`val` > childRequire + 1) {
        val thisGive = root.`val` - (childRequire + 1)
        count += thisGive
        return -thisGive
    }
    return 0
}
}