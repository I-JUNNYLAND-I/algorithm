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
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var max = 1

        fun dfs(root: TreeNode?): Int {
            if (root == null) return 0
            
            val left = dfs(root.left)
            val right = dfs(root.right)

            max = maxOf(max, left + right + 1)

            return maxOf(left, right) + 1
        }
        
        dfs(root)
        return max - 1
    }

}