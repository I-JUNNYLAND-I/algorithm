class Solution {
    fun bstFromPreorder(preorder: IntArray): TreeNode? {
        val preorderSize = preorder.size
        return bstFromPreorder(preorder, 0, preorderSize)
    }
    
    private fun bstFromPreorder(preorder: IntArray, startInclusive: Int, endExclusive: Int): TreeNode? {
        if (endExclusive - startInclusive <= 0) {
            return null
        }
        if (endExclusive - startInclusive == 1) {
            val preorderElement = preorder.get(startInclusive)
            return TreeNode(preorderElement)
        }
        val bstRootVal = preorder.get(startInclusive)
        var midpointIndex = startInclusive
        while (midpointIndex < endExclusive && preorder.get(midpointIndex) <= bstRootVal) {
            midpointIndex++
        }
        val bstRoot = TreeNode(bstRootVal)
        bstRoot.left = bstFromPreorder(preorder, startInclusive + 1, midpointIndex)
        bstRoot.right = bstFromPreorder(preorder, midpointIndex, endExclusive)
        return bstRoot
    }
}