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
    fun bstFromPreorder(preorder: IntArray): TreeNode? {

        if (preorder.isEmpty()) {
            return null
        }

        val root = TreeNode(preorder[0])

        for (i in preorder) {
            createTree(i, root)
        }

        return root
    }

    private fun createTree(i: Int, root: TreeNode?): TreeNode {
        if (root == null) {
            return TreeNode(i)
        }
        if (root.`val` > i) {
            root.left = createTree(i, root.left)
        }
        if (root.`val` < i) {
            root.right = createTree(i, root.right)
        }
        return root
    }
}
