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
fun checkTree(root: TreeNode?): Boolean {
    return if (root!!.left!!.`val` + root.right!!.`val` == root.`val`) {
        true
    } else {
        false
    }
}
}