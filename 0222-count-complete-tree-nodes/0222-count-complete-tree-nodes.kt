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
    fun countNodes(root: TreeNode?): Int {

        if (root == null) {
            return 0
        }
        dfs(root)

        return count
    }

    private fun dfs(root: TreeNode) {
        count++

        if (root.left != null) dfs(root.left!!)
        if (root.right != null) dfs(root.right!!)
    }
}