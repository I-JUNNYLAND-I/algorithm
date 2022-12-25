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
    private var answer: String = ""
    fun tree2str(root: TreeNode?): String {

        addStrDfs(root)

        return answer
    }

    private fun addStrDfs(node: TreeNode?) {
        if (node == null) return

        answer = answer.plus(node.`val`)

        if (node.left == null && node.right == null) return

        answer = answer.plus("(")
        tree2str(node.left)
        answer = answer.plus(")")

        if (node.right != null) {
            answer = answer.plus("(")
            tree2str(node.right)
            answer = answer.plus(")")
        }

    }
}
