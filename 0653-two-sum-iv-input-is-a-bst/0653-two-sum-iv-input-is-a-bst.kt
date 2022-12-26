class Solution {
    
    val set = mutableSetOf<Int>()
    
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        if(root == null) return false
                
        return if (set.contains(k - root.`val`)) {
            true
        } else {
            set.add(root.`val`)
            findTarget(root.right, k) || findTarget(root.left, k)
        }
    }
}