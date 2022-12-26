class Solution {
    fun tree2str(t: TreeNode?): String {
        return when {
            t == null -> ""
            t.left == null && t.right == null -> t.`val`.toString()
            t.left == null && t.right != null -> String.format("%d()(%s)", t.`val`, tree2str(t.right))
            t.left != null && t.right == null -> String.format("%d(%s)", t.`val`, tree2str(t.left))
            else -> String.format("%d(%s)(%s)", t.`val`, tree2str(t.left), tree2str(t.right))
        }
    }
}