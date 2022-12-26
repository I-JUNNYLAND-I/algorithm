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
    fun increasingBST(root: TreeNode?): TreeNode? {
        if (root == null) return null
        
        val stack = Stack<TreeNode>()
        pushAllLeft(root, stack)
        var newRoot: TreeNode? = null
        var pointer: TreeNode?  = null
        while (stack.isNotEmpty()) {
            val node = stack.pop()

            if (newRoot == null) {
                newRoot = TreeNode(node.`val`)
                pointer = newRoot
            } else {
                pointer!!.right = TreeNode(node.`val`)
                pointer = pointer!!.right
            }

            pushAllLeft(node.right, stack)
        }
        return newRoot
    }

    private fun pushAllLeft(root: TreeNode?, stack: Stack<TreeNode>) {
        var p = root
        while (p != null) {
            stack.push(p)
            p = p.left
        }
    }
}