/**
 * Example:
 * var ti = out.TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class out.TreeNode(var `val`: Int) {
 *     var left: out.TreeNode? = null
 *     var right: out.TreeNode? = null
 * }
 */
class Solution {
    var stringList = ArrayList<String>()
    fun binaryTreePaths(root: TreeNode?): List<String> {

        if (root == null) {
            return stringList
        }
        val nodeString: String = root.`val`.toString()
        createString(root, nodeString)
        return stringList
    }

    private fun createString(root: TreeNode?, nodeString: String) {
        if (root?.left == null && root?.right == null) {
            stringList.add(nodeString)
            return
        }

        if (root.left != null) {
            createString(root.left, nodeString.plus("->").plus(root.left?.`val`))
        }
        if (root.right != null) {
            createString(root.right, nodeString.plus("->").plus(root.right?.`val`))
        }
    }

}
