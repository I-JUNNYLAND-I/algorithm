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
var max = 0
var sum = 0

fun deepestLeavesSum(root: TreeNode?): Int {
    var depth = 0
    deepest(root,depth)
    sumDeepest(root,depth)
    return sum
}
fun deepest(root: TreeNode?, depth: Int = 0) {
    if (root == null) return
    if (depth > max) {
        max = depth
    }
    deepest(root.left, depth + 1)
    deepest(root.right, depth + 1)
}
fun sumDeepest(root: TreeNode?, depth: Int = 0) {
    if (root == null) return
    if (depth == max) {
        sum += root.`val`
    }
    sumDeepest(root.left, depth + 1)
    sumDeepest(root.right, depth + 1)
}
}