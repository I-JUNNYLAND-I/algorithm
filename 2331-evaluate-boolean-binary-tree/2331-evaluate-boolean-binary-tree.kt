class Solution {
    fun evaluateTree(root: TreeNode?): Boolean =
        when (root?.`val`) {
            0 -> false
            1 -> true
            2 -> evaluateTree(root?.left) || evaluateTree(root?.right)
            3 -> evaluateTree(root?.left) && evaluateTree(root?.right)
            else -> throw IllegalArgumentException("Null or invalid number")
        }
}