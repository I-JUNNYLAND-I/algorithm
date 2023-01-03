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

        var min = Int.MAX_VALUE
    var prev = Int.MAX_VALUE
    fun getMinimumDifference(root: TreeNode?): Int {
        inorder(root)
        return min;
    }
    
    fun inorder(root: TreeNode?){
        if (root == null)return
        inorder(root?.left)
        min = minOf(min, Math.abs(root?.`val` - prev))
        prev = root?.`val`
        inorder(root?.right)
    }
}