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
fun sumRootToLeaf(root: TreeNode?): Int {
        if (root == null) {
		return 0
        }
        var result = 0
        val stack = Stack<TreeNode>()
        stack.push(root)
        while (stack.size > 0) {
            val node = stack.pop()
            if (node.left == null && node.right == null) {
                result += node.`val`
            }
            if (node.left != null) {
                node.left!!.`val` += node.`val` shl 1
                stack.push(node.left)
            }
            if (node.right != null) {
                node.right!!.`val` += node.`val` shl 1
                stack.push(node.right)
            }
        }
        return result
    }
}