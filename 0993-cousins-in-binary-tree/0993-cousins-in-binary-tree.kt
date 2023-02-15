class Solution {
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        val depthList = getDepthList(root, x, y, 0)
        
        return depthList.isNotEmpty() && depthList[0] == depthList[1]
    }
    
    fun getDepthList(root: TreeNode?, x: Int, y: Int, depth: Int): List<Int> {
        if (root == null)
            return emptyList()
        
        if ((root?.left?.`val` == x || root?.left?.`val` == y)
           && (root?.right?.`val` == x || root?.right?.`val` == y))
            return emptyList()
        
        val depthList = mutableListOf<Int>()
        
        if (root?.`val` == x || root?.`val` == y)
            depthList.add(depth)
        
        depthList.addAll(getDepthList(root?.left, x, y, depth + 1))
        depthList.addAll(getDepthList(root?.right, x, y, depth + 1))
        
        return depthList
    }
}