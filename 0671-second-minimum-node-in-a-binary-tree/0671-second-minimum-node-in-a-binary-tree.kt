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
   fun findSecondMinimumValue(root: TreeNode?): Int {
        
        if(root == null) return -9
        var elements = arrayListOf<Int>()
        
        fun preOrder(root: TreeNode?){
            if(root == null) return 
            
            preOrder(root.left)
            elements.add(root.`val`)
            preOrder(root.right)
        }
        
        preOrder(root)
        
        elements.sort()
        var ans = elements[0]
        
        for(i in elements){
            if (ans != i ) return i
        }
        
        return -1   
    }
}