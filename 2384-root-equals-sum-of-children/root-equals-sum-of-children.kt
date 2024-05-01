class Solution {
    fun checkTree(root: TreeNode?): Boolean {
        return root!!.`val` == (root!!.left!!.`val` + root!!.right!!.`val`)
    }
}
