class FindElements(root: TreeNode?) {
    
    private val allValues = HashSet<Int>()
    
    init {
        recoverTree(root, 0)
    }

    fun find(target: Int): Boolean {
        return allValues.contains(target)
    }
    
    private fun recoverTree(root: TreeNode?, num: Int) {
        if (root == null)
            return
        
        root.`val` = num
        allValues.add(num)
        
        recoverTree(root.left, 2 * root.`val` + 1)
        recoverTree(root.right, 2 * root.`val` + 2)
    }

}